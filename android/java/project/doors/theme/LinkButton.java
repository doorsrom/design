package project.doors.theme;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

class LinkButton extends AppCompatButton {

    public LinkButton( Context context ) {
        this( context, null );
    }

    public LinkButton( Context context, AttributeSet attrs ) {
        this( context, attrs, R.attr.linkButtonStyle );
    }

    public LinkButton( Context context, AttributeSet attrs,
                              int defStyle ) {
        super( context, attrs, defStyle );

        final TypedArray array = context.obtainStyledAttributes( attrs,
                R.styleable.LinkButton, defStyle,
                R.style.Widget_AppCompat_Button );
        array.recycle();
    }
}