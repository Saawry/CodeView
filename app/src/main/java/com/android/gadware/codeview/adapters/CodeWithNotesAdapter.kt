package com.android.gadware.codeview.adapters

import android.content.Context
import com.android.gadware.codeview.adapters.AbstractCodeAdapter
import com.android.gadware.codeview.adapters.Options
import com.android.gadware.codeview.highlight.color
import com.android.gadware.codeview.views.LineNoteView

/**
 * @class CodeWithNotesAdapter
 *
 * Default code content adapter.
 *
 * @author Kirill Biakov
 */
open class CodeWithNotesAdapter : AbstractCodeAdapter<String> {

    constructor(context: Context) : super(context)

    constructor(context: Context, code: String) : super(context, code)

    constructor(context: Context, options: Options) : super(context, options)

    /**
     * Create footer view.
     *
     * @param entity Note content
     * @param isFirst Is first footer view
     */
    override fun createFooter(context: Context, entity: String, isFirst: Boolean) =
            LineNoteView.create(context,
                    text = entity,
                    isFirst = isFirst,
                    bgColor = options.theme.bgNum.color(),
                    textColor = options.theme.noteColor.color())
}
