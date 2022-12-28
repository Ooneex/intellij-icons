package com.ooneex.icons.providers;

import com.intellij.ide.IconProvider;
import com.intellij.lang.Language;
import com.intellij.openapi.util.IconLoader;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.ooneex.icons.data.FolderDataProvider;
import com.ooneex.icons.data.IconDataProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class FolderIconProvider extends IconProvider {
    private final Map<String, Icon> folders;

    public FolderIconProvider()
    {
        FolderDataProvider folderDataProvider = new FolderDataProvider();
        this.folders = folderDataProvider.getFolders();
    }

    @Override
    public @Nullable Icon getIcon(@NotNull PsiElement element, int flags) {
        VirtualFile directory = element.getContainingFile().getVirtualFile();
        if (!directory.isDirectory()) {
            return null;
        }

        @Nullable String name = directory.getName();
        System.out.println(name);
        return this.folders.getOrDefault(name, null);
    }
}
