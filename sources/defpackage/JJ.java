package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: JJ  reason: default package */
/* loaded from: classes.dex */
public final class JJ extends AppCompatImageView implements vI {
    public final /* synthetic */ RR R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public JJ(RR rr, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.R = rr;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        cFY.R(this, getContentDescription());
        setOnTouchListener(new M7(this, this, rr, 0));
    }

    @Override // defpackage.vI
    public final boolean R() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.R.U();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            cAO.O(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }

    @Override // defpackage.vI
    public final boolean v() {
        return false;
    }
}
