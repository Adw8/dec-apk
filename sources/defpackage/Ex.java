package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: Ex  reason: default package */
/* loaded from: classes.dex */
public final class Ex {

    /* renamed from: R  reason: collision with other field name */
    public final int f108R;

    /* renamed from: R  reason: collision with other field name */
    public final RL f109R;

    /* renamed from: R  reason: collision with other field name */
    public final Class f110R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f111R;
    public static final Ex R = new Ex(16, (String) null);
    public static final Ex v = new Ex(64, (String) null);
    public static final Ex c = new Ex(128, (String) null);
    public static final Ex e = new Ex(4096, (String) null);
    public static final Ex X = new Ex(8192, (String) null);
    public static final Ex O = new Ex(262144, (String) null);
    public static final Ex L = new Ex(524288, (String) null);
    public static final Ex Z = new Ex(1048576, (String) null);
    public static final Ex m = new Ex(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
    public static final Ex x = new Ex(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
    public static final Ex H = new Ex(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
    public static final Ex U = new Ex(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
    public static final Ex C = new Ex(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, null, xu.class);

    static {
        new Ex(1, (String) null);
        new Ex(2, (String) null);
        new Ex(4, (String) null);
        new Ex(8, (String) null);
        new Ex(32, (String) null);
        new Ex(256, J5.class);
        new Ex(512, J5.class);
        new Ex(1024, _e.class);
        new Ex(2048, _e.class);
        new Ex(16384, (String) null);
        new Ex(32768, (String) null);
        new Ex(65536, (String) null);
        new Ex(131072, Nz.class);
        new Ex(2097152, rq.class);
        new Ex(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
        new Ex(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, Is.class);
        new Ex(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, 16908358, null, null, null);
        new Ex(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, 16908359, null, null, null);
        new Ex(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, 16908360, null, null, null);
        new Ex(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, 16908361, null, null, null);
        new Ex(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
        new Ex(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, null, null, q1.class);
        new Ex(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, 16908356, null, null, null);
        new Ex(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, 16908357, null, null, null);
        new Ex(AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD, 16908362, null, null, null);
        new Ex(AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER, 16908372, null, null, null);
        new Ex(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START, 16908373, null, null, null);
        new Ex(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP, 16908374, null, null, null);
        new Ex(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL, 16908375, null, null, null);
        new Ex(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS, 16908376, null, null, null);
    }

    public Ex(int i, String str) {
        this(null, i, str, null, null);
    }

    public final int R() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f111R).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Ex)) {
            return false;
        }
        Ex ex = (Ex) obj;
        Object obj2 = this.f111R;
        return obj2 == null ? ex.f111R == null : obj2.equals(ex.f111R);
    }

    public final int hashCode() {
        Object obj = this.f111R;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final CharSequence v() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f111R).getLabel();
    }

    public Ex(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public Ex(Object obj, int i, String str, RL rl, Class cls) {
        this.f108R = i;
        this.f109R = rl;
        if (obj == null) {
            this.f111R = new AccessibilityNodeInfo.AccessibilityAction(i, str);
        } else {
            this.f111R = obj;
        }
        this.f110R = cls;
    }
}
