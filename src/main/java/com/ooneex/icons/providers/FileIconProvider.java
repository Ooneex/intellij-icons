package com.ooneex.icons.providers;

import com.intellij.ide.IconProvider;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiUtilCore;
import com.ooneex.icons.data.FolderDataProvider;
import com.ooneex.icons.data.IconDataProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;
import java.util.regex.*;

public class FileIconProvider extends IconProvider {
    private final Map<String, Icon> icons;
    private final Map<String, Icon> folders;

    public FileIconProvider()
    {
        IconDataProvider iconDataProvider = new IconDataProvider();
        FolderDataProvider folderDataProvider = new FolderDataProvider();
        this.icons = iconDataProvider.getIcons();
        this.folders = folderDataProvider.getFolders();
    }

    @Override
    public @Nullable Icon getIcon(@NotNull PsiElement element, int flags) {

        @Nullable VirtualFile file = PsiUtilCore.getVirtualFile(element);

        if (file == null) {
            return null;
        }

        if (file.isDirectory()) {
            @Nullable String name = file.getName().toLowerCase();
            @Nullable Icon folder = this.folders.getOrDefault(name, null);

            if (folder == null) {
                this.folders.getOrDefault("any_folder", null);
            }

            return folder;
        }

        String name = file.getName().toLowerCase();

        // Check for .env.*.local
        boolean isEnvLocal = Pattern.compile("^\\.env\\.?.*\\.local").matcher(name).find();
        if (isEnvLocal) {
            @Nullable Icon env = this.icons.getOrDefault("env_local", null);

            if (env != null) {
                return env;
            }
        }

        // Check for .env.*
        boolean isEnv = Pattern.compile("^\\.env\\.?").matcher(name).find();
        if (isEnv) {
            @Nullable Icon env = this.icons.getOrDefault("env", null);

            if (env != null) {
                return env;
            }
        }

        // Check for .eslintrc.*
        boolean isEslint = Pattern.compile("^\\.eslintrc\\.?").matcher(name).find();
        if (isEslint) {
            @Nullable Icon env = this.icons.getOrDefault("eslint", null);

            if (env != null) {
                return env;
            }
        }

        // Check for composer.*
        boolean isComposer = Pattern.compile("^composer\\.?").matcher(name).find();
        if (isComposer) {
            @Nullable Icon env = this.icons.getOrDefault("composer", null);

            if (env != null) {
                return env;
            }
        }

        // Check for phpunit.*
        boolean isPhpUnit = Pattern.compile("^phpunit\\.?").matcher(name).find();
        if (isPhpUnit) {
            @Nullable Icon env = this.icons.getOrDefault("phpunit", null);

            if (env != null) {
                return env;
            }
        }

        // Check for .(test\spec).*
        boolean isTest = Pattern.compile("\\.(test|spec)\\..+$").matcher(name).find();
        if (isTest) {
            @Nullable Icon test = this.icons.getOrDefault("test", null);

            if (test != null) {
                return test;
            }
        }

        @Nullable String extension = file.getExtension();

        // Get by parent directory
        VirtualFile parent = file.getParent();

        if (parent.isDirectory() && extension != null) {
            @Nullable String parentName = parent.getName().toLowerCase();

            @Nullable Icon icon = this.icons.getOrDefault(parentName + "." + extension, null);

            if (icon != null) {
                return icon;
            }

            // Get by sub parent directory
            VirtualFile subParent = parent.getParent();

            if (subParent.isDirectory()) {
                @Nullable String subParentName = subParent.getName().toLowerCase();
                @Nullable Icon subParentIcon = this.icons.getOrDefault(subParentName + "." + extension, null);

                if (subParentIcon != null) {
                    return subParentIcon;
                }
            }
        }

        return this.icons.getOrDefault(
                name,
                this.icons.getOrDefault(extension, null)
        );
    }
}
