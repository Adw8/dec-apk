package defpackage;

import dev.kdrag0n.virtcontainer.R;

/* renamed from: ru  reason: default package */
/* loaded from: classes.dex */
public enum ru {
    Up("Up", R.drawable.msic_keyboard_arrow_up_20),
    Down("Down", R.drawable.msic_keyboard_arrow_down_20),
    Left("Left", R.drawable.msic_keyboard_arrow_left_20),
    Right("Right", R.drawable.msic_keyboard_arrow_right_20),
    PageUp("Page Up", R.drawable.msic_first_page_20, 90.0f),
    PageDown("Page Down", R.drawable.msic_last_page_20, 90.0f),
    Home("Home", R.drawable.msic_first_page_20),
    End("End", R.drawable.msic_last_page_20);
    

    /* renamed from: R  reason: collision with other field name */
    public final float f7402R;

    /* renamed from: R  reason: collision with other field name */
    public final String f7403R;

    /* renamed from: e  reason: collision with other field name */
    public final int f7404e;

    /* synthetic */ ru(String str, int i) {
        this(str, i, 0.0f);
    }

    ru(String str, int i, float f) {
        this.f7403R = str;
        this.f7404e = i;
        this.f7402R = f;
    }
}
