package com.sharedaka.ui.sequence;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentManager;
import org.jetbrains.annotations.NotNull;

public class SequenceToolWindowsFactory implements ToolWindowFactory {
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        toolWindow.setTitle("Swagger Helper");
        ContentManager contentManager = toolWindow.getContentManager();
        addEmptyContent(project, toolWindow);
    }

    public void addEmptyContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        ContentManager contentManager = toolWindow.getContentManager();
        Content content = contentManager.getFactory().createContent(new SwaggerMethodPanel(), "Open ...", false);
        contentManager.addContent(content);
    }
}
