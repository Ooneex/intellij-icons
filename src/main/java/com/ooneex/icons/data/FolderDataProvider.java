package com.ooneex.icons.data;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class FolderDataProvider {
    private final Map<String, Icon> folders = new HashMap<String, Icon>();

    public FolderDataProvider() {
        this.folders.put(".vscode", IconLoader.getIcon("icons/folderTypes/vscode.svg", FolderDataProvider.class));
        this.folders.put("tests", IconLoader.getIcon("icons/folderTypes/tests.svg", FolderDataProvider.class));
        this.folders.put("app", IconLoader.getIcon("icons/folderTypes/apps.svg", FolderDataProvider.class));
        this.folders.put("apps", IconLoader.getIcon("icons/folderTypes/apps.svg", FolderDataProvider.class));
        this.folders.put("package", IconLoader.getIcon("icons/folderTypes/packages.svg", FolderDataProvider.class));
        this.folders.put("packages", IconLoader.getIcon("icons/folderTypes/packages.svg", FolderDataProvider.class));
        this.folders.put("conf", IconLoader.getIcon("icons/folderTypes/config.svg", FolderDataProvider.class));
        this.folders.put("config", IconLoader.getIcon("icons/folderTypes/config.svg", FolderDataProvider.class));
        this.folders.put("configs", IconLoader.getIcon("icons/folderTypes/config.svg", FolderDataProvider.class));
        this.folders.put("helper", IconLoader.getIcon("icons/folderTypes/helper.svg", FolderDataProvider.class));
        this.folders.put("helpers", IconLoader.getIcon("icons/folderTypes/helper.svg", FolderDataProvider.class));
        this.folders.put("docker", IconLoader.getIcon("icons/folderTypes/docker.svg", FolderDataProvider.class));
        this.folders.put("plugin", IconLoader.getIcon("icons/folderTypes/plugin.svg", FolderDataProvider.class));
        this.folders.put("plugins", IconLoader.getIcon("icons/folderTypes/plugin.svg", FolderDataProvider.class));
        this.folders.put("def", IconLoader.getIcon("icons/folderTypes/def.svg", FolderDataProvider.class));
        this.folders.put("definition", IconLoader.getIcon("icons/folderTypes/def.svg", FolderDataProvider.class));
        this.folders.put("definitions", IconLoader.getIcon("icons/folderTypes/def.svg", FolderDataProvider.class));
        this.folders.put("middleware", IconLoader.getIcon("icons/folderTypes/middleware.svg", FolderDataProvider.class));
        this.folders.put("middlewares", IconLoader.getIcon("icons/folderTypes/middleware.svg", FolderDataProvider.class));
        this.folders.put("components", IconLoader.getIcon("icons/folderTypes/component.svg", FolderDataProvider.class));
        this.folders.put("component", IconLoader.getIcon("icons/folderTypes/component.svg", FolderDataProvider.class));
        this.folders.put("handler", IconLoader.getIcon("icons/folderTypes/handler.svg", FolderDataProvider.class));
        this.folders.put("handlers", IconLoader.getIcon("icons/folderTypes/handler.svg", FolderDataProvider.class));
        this.folders.put("island", IconLoader.getIcon("icons/folderTypes/island.svg", FolderDataProvider.class));
        this.folders.put("islands", IconLoader.getIcon("icons/folderTypes/island.svg", FolderDataProvider.class));

        this.folders.put("routing", IconLoader.getIcon("icons/folderTypes/routing.svg", FolderDataProvider.class));
        this.folders.put("route", IconLoader.getIcon("icons/folderTypes/routing.svg", FolderDataProvider.class));
        this.folders.put("router", IconLoader.getIcon("icons/folderTypes/routing.svg", FolderDataProvider.class));
        this.folders.put("routes", IconLoader.getIcon("icons/folderTypes/routing.svg", FolderDataProvider.class));

        this.folders.put("public", IconLoader.getIcon("icons/folderTypes/public.svg", FolderDataProvider.class));
        this.folders.put("static", IconLoader.getIcon("icons/folderTypes/public.svg", FolderDataProvider.class));
        this.folders.put("web", IconLoader.getIcon("icons/folderTypes/public.svg", FolderDataProvider.class));

        this.folders.put("view", IconLoader.getIcon("icons/folderTypes/view.svg", FolderDataProvider.class));
        this.folders.put("views", IconLoader.getIcon("icons/folderTypes/view.svg", FolderDataProvider.class));
        this.folders.put("template", IconLoader.getIcon("icons/folderTypes/view.svg", FolderDataProvider.class));
        this.folders.put("templates", IconLoader.getIcon("icons/folderTypes/view.svg", FolderDataProvider.class));

        this.folders.put("translation", IconLoader.getIcon("icons/folderTypes/translation.svg", FolderDataProvider.class));
        this.folders.put("translations", IconLoader.getIcon("icons/folderTypes/translation.svg", FolderDataProvider.class));

        this.folders.put("cli", IconLoader.getIcon("icons/folderTypes/cli.svg", FolderDataProvider.class));
        this.folders.put("bin", IconLoader.getIcon("icons/folderTypes/cli.svg", FolderDataProvider.class));
        this.folders.put("command", IconLoader.getIcon("icons/folderTypes/cli.svg", FolderDataProvider.class));

        this.folders.put("src", IconLoader.getIcon("icons/folderTypes/src.svg", FolderDataProvider.class));
        this.folders.put("security", IconLoader.getIcon("icons/folderTypes/security.svg", FolderDataProvider.class));

        this.folders.put("fresh", IconLoader.getIcon("icons/folderTypes/fresh.svg", FolderDataProvider.class));

        this.folders.put("vendor", IconLoader.getIcon("icons/folderTypes/ignore.svg", FolderDataProvider.class));
        this.folders.put("var", IconLoader.getIcon("icons/folderTypes/ignore.svg", FolderDataProvider.class));
        this.folders.put("build", IconLoader.getIcon("icons/folderTypes/ignore.svg", FolderDataProvider.class));
        this.folders.put("dist", IconLoader.getIcon("icons/folderTypes/ignore.svg", FolderDataProvider.class));
        this.folders.put(".turbo", IconLoader.getIcon("icons/folderTypes/ignore.svg", FolderDataProvider.class));
        this.folders.put(".idea", IconLoader.getIcon("icons/folderTypes/ignore.svg", FolderDataProvider.class));
        this.folders.put("node_modules", IconLoader.getIcon("icons/folderTypes/node_modules.svg", FolderDataProvider.class));
    }
    public Map<String, Icon> getFolders() {
        return this.folders;
    }
}
