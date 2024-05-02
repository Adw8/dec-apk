package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ActionMode;
import android.view.Menu;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: j0  reason: default package */
/* loaded from: classes.dex */
public final class j0 {
    public Object O;
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f4786R;
    public Object X;
    public Object c;
    public Object e;
    public Object v;

    public j0(f_c f_c, gIA gia, f_c f_c2, f_c f_c3, f_c f_c4, f_c f_c5) {
        this.R = 1;
        this.f4786R = f_c;
        this.v = gia;
        this.c = f_c2;
        this.e = f_c3;
        this.X = f_c4;
        this.O = f_c5;
    }

    public static void H(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter L;
        Rect rect = mTA.R;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = pp.R;
        }
        PorterDuff.Mode mode2 = pp.R;
        synchronized (pp.class) {
            L = gNS.L(i, mode);
        }
        mutate.setColorFilter(L);
    }

    public static LayerDrawable O(gNS gns, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable X = gns.X(context, R.drawable.abc_star_black_48dp);
        Drawable X2 = gns.X(context, R.drawable.abc_star_half_black_48dp);
        if ((X instanceof BitmapDrawable) && X.getIntrinsicWidth() == dimensionPixelSize && X.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable2 = (BitmapDrawable) X;
            bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            X.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            X.draw(canvas);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
            bitmapDrawable = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
        if ((X2 instanceof BitmapDrawable) && X2.getIntrinsicWidth() == dimensionPixelSize && X2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) X2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            X2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            X2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    public static void R(Menu menu, int i) {
        int i2;
        if (i != 0) {
            int i3 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i != 0) {
                if (i3 == 0) {
                    i2 = 17039361;
                } else if (i3 == 1) {
                    i2 = 17039371;
                } else if (i3 == 2) {
                    i2 = 17039363;
                } else if (i3 == 3) {
                    i2 = 17039373;
                } else {
                    throw new j8f((Object) null);
                }
                menu.add(0, i3, i3, i2).setShowAsAction(1);
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }

    public static ColorStateList X(Context context, int i) {
        int c = lM2.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{lM2.f5664R, lM2.c, lM2.v, lM2.X}, new int[]{lM2.v(context, R.attr.colorButtonNormal), B7.v(c, i), B7.v(c, i), i});
    }

    public static boolean c(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static void v(Menu menu, int i, f_c f_c) {
        if (f_c != null) {
            if (i == 0) {
                throw null;
            } else if (menu.findItem(i - 1) == null) {
                R(menu, i);
                return;
            }
        }
        if (f_c != null) {
            return;
        }
        if (i != 0) {
            int i2 = i - 1;
            if (menu.findItem(i2) == null) {
                return;
            }
            if (i != 0) {
                menu.removeItem(i2);
                return;
            }
            throw null;
        }
        throw null;
    }

    public final ColorStateList L(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return C1.v(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return C1.v(context, R.color.abc_tint_switch_track);
        }
        if (i == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList e = lM2.e(context, R.attr.colorSwitchThumbNormal);
            if (e == null || !e.isStateful()) {
                iArr[0] = lM2.f5664R;
                iArr2[0] = lM2.v(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = lM2.e;
                iArr2[1] = lM2.c(context, R.attr.colorControlActivated);
                iArr[2] = lM2.X;
                iArr2[2] = lM2.c(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = lM2.f5664R;
                iArr[0] = iArr3;
                iArr2[0] = e.getColorForState(iArr3, 0);
                iArr[1] = lM2.e;
                iArr2[1] = lM2.c(context, R.attr.colorControlActivated);
                iArr[2] = lM2.X;
                iArr2[2] = e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
            return X(context, lM2.c(context, R.attr.colorButtonNormal));
        } else {
            if (i == R.drawable.abc_btn_borderless_material) {
                return X(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return X(context, lM2.c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return C1.v(context, R.color.abc_tint_spinner);
            }
            if (c((int[]) this.v, i)) {
                return lM2.e(context, R.attr.colorControlNormal);
            }
            if (c((int[]) this.X, i)) {
                return C1.v(context, R.color.abc_tint_default);
            }
            if (c((int[]) this.O, i)) {
                return C1.v(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return C1.v(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
    }

    public final String Z(String str) {
        return ((bd4) this.c).R(str);
    }

    public final void e(String str, ArrayList arrayList) {
        String[] stringArrayExtra = ((Intent) this.v).getStringArrayExtra(str);
        int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
        String[] strArr = new String[arrayList.size() + length];
        arrayList.toArray(strArr);
        if (stringArrayExtra != null) {
            System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
        }
        ((Intent) this.v).putExtra(str, strArr);
    }

    public final void m(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (actionMode != null) {
            if (((f_c) this.c) != null) {
                R(menu, 1);
            }
            if (((f_c) this.e) != null) {
                R(menu, 2);
            }
            if (((f_c) this.X) != null) {
                R(menu, 3);
            }
            if (((f_c) this.O) != null) {
                R(menu, 4);
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public final String toString() {
        switch (this.R) {
            case 3:
                StringBuilder U = opT.U("Request{method=");
                U.append((String) this.v);
                U.append(", url=");
                U.append((a7_) this.f4786R);
                if (((bd4) this.c).R.length / 2 != 0) {
                    U.append(", headers=[");
                    int i = 0;
                    Iterator it = ((bd4) this.c).iterator();
                    while (true) {
                        o7s o7s = (o7s) it;
                        if (o7s.hasNext()) {
                            Object next = o7s.next();
                            i++;
                            if (i >= 0) {
                                kSh ksh = (kSh) next;
                                String str = (String) ksh.R;
                                String str2 = (String) ksh.v;
                                if (i > 0) {
                                    U.append(", ");
                                }
                                U.append(str);
                                U.append(':');
                                U.append(str2);
                            } else {
                                pdD.k();
                                throw null;
                            }
                        } else {
                            U.append(']');
                        }
                    }
                }
                if (!((Map) this.X).isEmpty()) {
                    U.append(", tags=");
                    U.append((Map) this.X);
                }
                U.append('}');
                return U.toString();
            default:
                return super.toString();
        }
    }

    public final boolean x(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        v(menu, 1, (f_c) this.c);
        v(menu, 2, (f_c) this.e);
        v(menu, 3, (f_c) this.X);
        v(menu, 4, (f_c) this.O);
        return true;
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public j0(q4 q4Var) {
        this(q4Var, gIA.R, null, null, null, null);
        this.R = 1;
    }

    public j0(fmL fml) {
        this.R = 3;
        a7_ a7_ = fml.R;
        if (a7_ != null) {
            this.f4786R = a7_;
            this.v = fml.f3558R;
            this.c = fml.f3557R.v();
            this.e = fml.f3556R;
            this.X = mHQ.h(fml.f3559R);
            return;
        }
        throw new IllegalStateException("url == null".toString());
    }

    public j0() {
        this.R = 0;
        this.f4786R = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.v = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.e = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.X = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.O = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public j0(Context context) {
        this.R = 2;
        context.getClass();
        this.f4786R = context;
        Intent action = new Intent().setAction("android.intent.action.SEND");
        this.v = action;
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        ((Intent) this.v).putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        ((Intent) this.v).addFlags(524288);
        Activity activity = null;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            ComponentName componentName = activity.getComponentName();
            ((Intent) this.v).putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            ((Intent) this.v).putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
    }
}
