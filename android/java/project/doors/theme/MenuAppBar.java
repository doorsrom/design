package project.doors.theme;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

class MenuAppBar extends android.support.v7.widget.AppCompatTextView {

    public MenuAppBar( Context context ) {
        this( context, null );
    }

    public MenuAppBar( Context context, AttributeSet attrs ) {
        this( context, attrs, R.attr.menuAppBarStyle );
    }

    public MenuAppBar( Context context, AttributeSet attrs,
                              int defStyle ) {
        super( context, attrs, defStyle );

        final TypedArray array = context.obtainStyledAttributes( attrs,
                R.styleable.MenuAppBar, defStyle,
                R.style.TextAppearance_AppCompat_Small );
        array.recycle();
    }
}