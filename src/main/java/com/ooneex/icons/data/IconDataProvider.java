package com.ooneex.icons.data;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class IconDataProvider {
    private final Map<String, Icon> icons = new HashMap<String, Icon>();

    public IconDataProvider() {
        this.icons.put("mdx", IconLoader.getIcon("icons/fileTypes/mdx.svg", IconDataProvider.class));
        this.icons.put("md", IconLoader.getIcon("icons/fileTypes/md.svg", IconDataProvider.class));
        this.icons.put("yml", IconLoader.getIcon("icons/fileTypes/yaml.svg", IconDataProvider.class));
        this.icons.put("yaml", IconLoader.getIcon("icons/fileTypes/yaml.svg", IconDataProvider.class));
        this.icons.put("ts", IconLoader.getIcon("icons/fileTypes/ts.svg", IconDataProvider.class));
        this.icons.put("jsx", IconLoader.getIcon("icons/fileTypes/jsx.svg", IconDataProvider.class));
        this.icons.put("tsx", IconLoader.getIcon("icons/fileTypes/jsx.svg", IconDataProvider.class));
        this.icons.put("gitignore", IconLoader.getIcon("icons/fileTypes/git.svg", IconDataProvider.class));
        this.icons.put("txt", IconLoader.getIcon("icons/fileTypes/text.svg", IconDataProvider.class));
        this.icons.put("json", IconLoader.getIcon("icons/fileTypes/json.svg", IconDataProvider.class));
        this.icons.put("svg", IconLoader.getIcon("icons/fileTypes/svg.svg", IconDataProvider.class));
        this.icons.put("scss", IconLoader.getIcon("icons/fileTypes/scss.svg", IconDataProvider.class));
        this.icons.put("sh", IconLoader.getIcon("icons/fileTypes/terminal.svg", IconDataProvider.class));

        this.icons.put("test", IconLoader.getIcon("icons/fileTypes/test.svg", IconDataProvider.class));
        this.icons.put("env_local", IconLoader.getIcon("icons/fileTypes/env_local.svg", IconDataProvider.class));
        this.icons.put("eslint", IconLoader.getIcon("icons/fileTypes/eslint.svg", IconDataProvider.class));
        this.icons.put("composer", IconLoader.getIcon("icons/fileTypes/composer.svg", IconDataProvider.class));
        this.icons.put("env", IconLoader.getIcon("icons/fileTypes/env.svg", IconDataProvider.class));
        this.icons.put("phpunit", IconLoader.getIcon("icons/fileTypes/phpunit.svg", IconDataProvider.class));

        this.icons.put("mod.ts", IconLoader.getIcon("icons/fileTypes/deno.svg", IconDataProvider.class));
        this.icons.put("deno.json", IconLoader.getIcon("icons/fileTypes/deno_config.svg", IconDataProvider.class));
        this.icons.put("deno.lock", IconLoader.getIcon("icons/fileTypes/deno_lock.svg", IconDataProvider.class));
        this.icons.put("deps.ts", IconLoader.getIcon("icons/fileTypes/deps.svg", IconDataProvider.class));
        this.icons.put("types.ts", IconLoader.getIcon("icons/fileTypes/types.svg", IconDataProvider.class));
        this.icons.put("tsconfig.json", IconLoader.getIcon("icons/fileTypes/tsconfig.svg", IconDataProvider.class));
        this.icons.put("fresh.gen.ts", IconLoader.getIcon("icons/fileTypes/fresh.svg", IconDataProvider.class));
        this.icons.put("_middleware.ts", IconLoader.getIcon("icons/fileTypes/middleware.svg", IconDataProvider.class));
        this.icons.put("_middlewares.ts", IconLoader.getIcon("icons/fileTypes/middleware.svg", IconDataProvider.class));
        this.icons.put("dockerfile", IconLoader.getIcon("icons/fileTypes/docker.svg", IconDataProvider.class));
        this.icons.put("docker-compose.yml", IconLoader.getIcon("icons/fileTypes/docker.svg", IconDataProvider.class));
        this.icons.put("readme.md", IconLoader.getIcon("icons/fileTypes/readme.svg", IconDataProvider.class));
        this.icons.put("package.json", IconLoader.getIcon("icons/fileTypes/npm.svg", IconDataProvider.class));
        this.icons.put("pnpm-lock.yaml", IconLoader.getIcon("icons/fileTypes/pnpm.svg", IconDataProvider.class));
        this.icons.put("pnpm-workspace.yaml", IconLoader.getIcon("icons/fileTypes/pnpm.svg", IconDataProvider.class));
        this.icons.put("turbo.json", IconLoader.getIcon("icons/fileTypes/turbo.svg", IconDataProvider.class));
        this.icons.put("symfony.lock", IconLoader.getIcon("icons/fileTypes/symfony_lock.svg", IconDataProvider.class));
        this.icons.put("yarn.lock", IconLoader.getIcon("icons/fileTypes/yarn_lock.svg", IconDataProvider.class));
        this.icons.put(".npmrc", IconLoader.getIcon("icons/fileTypes/npmrc.svg", IconDataProvider.class));
        this.icons.put("jest.config.json", IconLoader.getIcon("icons/fileTypes/jest.svg", IconDataProvider.class));

        this.icons.put("component.tsx", IconLoader.getIcon("icons/fileTypes/components.svg", IconDataProvider.class));
        this.icons.put("components.tsx", IconLoader.getIcon("icons/fileTypes/components.svg", IconDataProvider.class));
        this.icons.put("conf.yml", IconLoader.getIcon("icons/fileTypes/config_yml.svg", IconDataProvider.class));
        this.icons.put("conf.yaml", IconLoader.getIcon("icons/fileTypes/config_yml.svg", IconDataProvider.class));
        this.icons.put("config.yml", IconLoader.getIcon("icons/fileTypes/config_yml.svg", IconDataProvider.class));
        this.icons.put("config.yaml", IconLoader.getIcon("icons/fileTypes/config_yml.svg", IconDataProvider.class));
        this.icons.put("handler.ts", IconLoader.getIcon("icons/fileTypes/handlers.svg", IconDataProvider.class));
        this.icons.put("handlers.ts", IconLoader.getIcon("icons/fileTypes/handlers.svg", IconDataProvider.class));
        this.icons.put("island.tsx", IconLoader.getIcon("icons/fileTypes/islands.svg", IconDataProvider.class));
        this.icons.put("islands.tsx", IconLoader.getIcon("icons/fileTypes/islands.svg", IconDataProvider.class));
        this.icons.put("middleware.ts", IconLoader.getIcon("icons/fileTypes/middleware.svg", IconDataProvider.class));
        this.icons.put("middlewares.ts", IconLoader.getIcon("icons/fileTypes/middleware.svg", IconDataProvider.class));
        this.icons.put("routes.yml", IconLoader.getIcon("icons/fileTypes/routes.svg", IconDataProvider.class));
        this.icons.put("view.tsx", IconLoader.getIcon("icons/fileTypes/views.svg", IconDataProvider.class));
        this.icons.put("views.tsx", IconLoader.getIcon("icons/fileTypes/views.svg", IconDataProvider.class));
    }
    public Map<String, Icon> getIcons() {
        return this.icons;
    }
}
