package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.d;
import com.google.android.material.datepicker.e;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: hSy  reason: default package */
/* loaded from: classes.dex */
public final class hSy<S> extends l6q {
    public static final /* synthetic */ int H = 0;
    public BD R;

    /* renamed from: R  reason: collision with other field name */
    public BS f4268R;

    /* renamed from: R  reason: collision with other field name */
    public RecyclerView f4269R;

    /* renamed from: R  reason: collision with other field name */
    public fhy f4270R;
    public View c;
    public int m;
    public View v;

    /* renamed from: v  reason: collision with other field name */
    public RecyclerView f4271v;
    public int x;

    @Override // defpackage.pm2
    public final void A(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.m);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.R);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f4270R);
    }

    public final void E(fhy fhy) {
        fhy fhy2 = ((e) this.f4271v.getAdapter()).R.f20R;
        Calendar calendar = fhy2.f3521R;
        if (calendar instanceof GregorianCalendar) {
            int i = fhy.X;
            int i2 = fhy2.X;
            int i3 = fhy.e;
            int i4 = fhy2.e;
            int i5 = (i3 - i4) + ((i - i2) * 12);
            fhy fhy3 = this.f4270R;
            if (calendar instanceof GregorianCalendar) {
                int i6 = i5 - ((fhy3.e - i4) + ((fhy3.X - i2) * 12));
                boolean z = false;
                boolean z2 = Math.abs(i6) > 3;
                if (i6 > 0) {
                    z = true;
                }
                this.f4270R = fhy;
                if (z2 && z) {
                    this.f4271v._(i5 - 3);
                    this.f4271v.post(new hk0(i5, 1, this));
                } else if (z2) {
                    this.f4271v._(i5 + 3);
                    this.f4271v.post(new hk0(i5, 1, this));
                } else {
                    this.f4271v.post(new hk0(i5, 1, this));
                }
            } else {
                throw new IllegalArgumentException("Only Gregorian calendars are supported.");
            }
        } else {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
    }

    @Override // defpackage.pm2
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        eFe efe;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(H(), this.m);
        this.f4268R = new BS(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        fhy fhy = this.R.f20R;
        if (ajY.D(contextThemeWrapper)) {
            i2 = R.layout.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = R.layout.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        Resources resources = k().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = d.e;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        of5.O(gridView, new lGF(0, this));
        int i4 = this.R.e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new k65(i4) : new k65()));
        gridView.setNumColumns(fhy.O);
        gridView.setEnabled(false);
        this.f4271v = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        H();
        this.f4271v.setLayoutManager(new nSI(this, i, i));
        this.f4271v.setTag("MONTHS_VIEW_GROUP_TAG");
        e eVar = new e(contextThemeWrapper, null, this.R, new h89(20, this));
        this.f4271v.setAdapter(eVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f4269R = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f4269R.setLayoutManager(new GridLayoutManager(integer));
            this.f4269R.setAdapter(new cKO(this));
            this.f4269R.L(new j2l(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            of5.O(materialButton, new lGF(1, this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.v = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.c = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            f(1);
            materialButton.setText(this.f4270R.O());
            this.f4271v.Z(new hcT(this, eVar, materialButton));
            materialButton.setOnClickListener(new pS(3, this));
            materialButton3.setOnClickListener(new hqE(this, eVar, 0));
            materialButton2.setOnClickListener(new hqE(this, eVar, 1));
        }
        if (!ajY.D(contextThemeWrapper) && (recyclerView2 = (efe = new eFe()).f3040R) != (recyclerView = this.f4271v)) {
            if (recyclerView2 != null) {
                nQ3 nq3 = efe.f3041R;
                ArrayList arrayList = recyclerView2.f1416e;
                if (arrayList != null) {
                    arrayList.remove(nq3);
                }
                efe.f3040R.setOnFlingListener(null);
            }
            efe.f3040R = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    efe.f3040R.Z(efe.f3041R);
                    efe.f3040R.setOnFlingListener(efe);
                    new Scroller(efe.f3040R.getContext(), new DecelerateInterpolator());
                    efe.O();
                } else {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
            }
        }
        RecyclerView recyclerView4 = this.f4271v;
        fhy fhy2 = this.f4270R;
        fhy fhy3 = eVar.R.f20R;
        if (fhy3.f3521R instanceof GregorianCalendar) {
            recyclerView4._((fhy2.e - fhy3.e) + ((fhy2.X - fhy3.X) * 12));
            return inflate;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // defpackage.pm2
    public final void K(Bundle bundle) {
        super.K(bundle);
        if (bundle == null) {
            bundle = ((pm2) this).c;
        }
        this.m = bundle.getInt("THEME_RES_ID_KEY");
        hIm him = (hIm) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.R = (BD) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f4270R = (fhy) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // defpackage.l6q
    public final boolean M(kT5 kt5) {
        return super.M(kt5);
    }

    public final void f(int i) {
        this.x = i;
        if (i == 2) {
            this.f4269R.getLayoutManager().xN(this.f4270R.X - ((cKO) this.f4269R.getAdapter()).R.R.f20R.X);
            this.v.setVisibility(0);
            this.c.setVisibility(8);
        } else if (i == 1) {
            this.v.setVisibility(8);
            this.c.setVisibility(0);
            E(this.f4270R);
        }
    }
}
