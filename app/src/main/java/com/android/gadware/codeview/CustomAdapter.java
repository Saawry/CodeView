package com.android.gadware.codeview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.android.gadware.codeview.adapters.AbstractCodeAdapter;
import com.android.gadware.codeview.adapters.Options;
import com.android.gadware.codeview.highlight.ColorTheme;

import org.jetbrains.annotations.NotNull;


public class CustomAdapter extends AbstractCodeAdapter<CustomAdapter.CustomModel> {

    public CustomAdapter(@NotNull Context context, @NotNull String code) {
        super(context, Options.Default.get(context)
                .withCode(code)
                .withTheme(ColorTheme.SOLARIZED_LIGHT));
    }

    @NotNull
    @Override
    public View createFooter(@NotNull Context context, CustomModel entity, boolean isFirst) {
        View footerView = LayoutInflater.from(context).inflate(R.layout.custom_footer, null);
        ((TextView) footerView.findViewById(R.id.tv_footer_title)).setText(entity.firstName);
        ((TextView) footerView.findViewById(R.id.tv_footer_description)).setText(entity.lastName);
        return footerView;
    }

    public static class CustomModel {
        private String firstName;
        private String lastName;

        public CustomModel(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}
