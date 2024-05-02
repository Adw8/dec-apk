package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements jd5, AbsListView.SelectionBoundsAdjuster {
    public Context R;

    /* renamed from: R  reason: collision with other field name */
    public Drawable f1033R;

    /* renamed from: R  reason: collision with other field name */
    public LayoutInflater f1034R;

    /* renamed from: R  reason: collision with other field name */
    public CheckBox f1035R;

    /* renamed from: R  reason: collision with other field name */
    public ImageView f1036R;

    /* renamed from: R  reason: collision with other field name */
    public LinearLayout f1037R;

    /* renamed from: R  reason: collision with other field name */
    public RadioButton f1038R;

    /* renamed from: R  reason: collision with other field name */
    public TextView f1039R;

    /* renamed from: R  reason: collision with other field name */
    public pce f1040R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1041R;
    public ImageView c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f1042c;
    public int e;
    public Drawable v;

    /* renamed from: v  reason: collision with other field name */
    public ImageView f1043v;

    /* renamed from: v  reason: collision with other field name */
    public TextView f1044v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f1045v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        CV h = CV.h(getContext(), attributeSet, iTI.y, R.attr.listMenuViewStyle, 0);
        this.f1033R = h.U(5);
        this.e = h.y(1, -1);
        this.f1041R = h.Z(7, false);
        this.R = context;
        this.v = h.U(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f1045v = obtainStyledAttributes.hasValue(0);
        h.z();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1034R == null) {
            this.f1034R = LayoutInflater.from(getContext());
        }
        return this.f1034R;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f1043v;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.c;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.c.getLayoutParams();
            rect.top = this.c.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (r0 == false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0129  */
    @Override // defpackage.jd5
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.pce r11) {
        /*
        // Method dump skipped, instructions count: 329
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(pce):void");
    }

    @Override // defpackage.jd5
    public pce getItemData() {
        return this.f1040R;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f1033R;
        WeakHashMap weakHashMap = of5.f6887R;
        mHC.g(this, drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1039R = textView;
        int i = this.e;
        if (i != -1) {
            textView.setTextAppearance(this.R, i);
        }
        this.f1044v = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1043v = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.v);
        }
        this.c = (ImageView) findViewById(R.id.group_divider);
        this.f1037R = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f1036R != null && this.f1041R) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1036R.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        View view;
        CompoundButton compoundButton;
        if (z || this.f1038R != null || this.f1035R != null) {
            if ((this.f1040R.Z & 4) != 0) {
                if (this.f1038R == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    this.f1038R = radioButton;
                    LinearLayout linearLayout = this.f1037R;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f1038R;
                view = this.f1035R;
            } else {
                if (this.f1035R == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    this.f1035R = checkBox;
                    LinearLayout linearLayout2 = this.f1037R;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f1035R;
                view = this.f1038R;
            }
            if (z) {
                compoundButton.setChecked(this.f1040R.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.f1035R;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.f1038R;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f1040R.Z & 4) != 0) {
            if (this.f1038R == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1038R = radioButton;
                LinearLayout linearLayout = this.f1037R;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1038R;
        } else {
            if (this.f1035R == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1035R = checkBox;
                LinearLayout linearLayout2 = this.f1037R;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1035R;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f1042c = z;
        this.f1041R = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setVisibility((this.f1045v || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1040R.f7117R.getClass();
        boolean z = this.f1042c;
        if (z || this.f1041R) {
            ImageView imageView = this.f1036R;
            if (imageView != null || drawable != null || this.f1041R) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                    this.f1036R = imageView2;
                    LinearLayout linearLayout = this.f1037R;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.f1041R) {
                    ImageView imageView3 = this.f1036R;
                    if (!z) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.f1036R.getVisibility() != 0) {
                        this.f1036R.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f1036R.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f1039R.setText(charSequence);
            if (this.f1039R.getVisibility() != 0) {
                this.f1039R.setVisibility(0);
            }
        } else if (this.f1039R.getVisibility() != 8) {
            this.f1039R.setVisibility(8);
        }
    }
}
