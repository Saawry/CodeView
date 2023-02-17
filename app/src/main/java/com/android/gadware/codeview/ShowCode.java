package com.android.gadware.codeview;

import com.android.gadware.codeview.highlight.ColorTheme;
import com.android.gadware.codeview.highlight.Font;

public class ShowCode {
    public static void showCode(CodeView codeView){
        codeView.updateOptions(options -> {
            options.withFont(Font.Consolas)
                    .withTheme(ColorTheme.SOLARIZED_LIGHT)
                    .withShadows()
                    .setShortcut(false);
            return null;
        });
    }
}
