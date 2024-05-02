package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: j3y  reason: default package */
/* loaded from: classes.dex */
public final class j3y extends c18 implements joe {
    public static final /* synthetic */ int H = 0;
    public int L;
    public int O;

    /* renamed from: R  reason: collision with other field name */
    public final Context f4811R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f4814R;

    /* renamed from: R  reason: collision with other field name */
    public final ovn f4815R;
    public int X;
    public int Z;
    public int m;
    public int x;

    /* renamed from: R  reason: collision with other field name */
    public final Paint.FontMetrics f4812R = new Paint.FontMetrics();

    /* renamed from: R  reason: collision with other field name */
    public final pgs f4816R = new pgs(2, this);

    /* renamed from: R  reason: collision with other field name */
    public final Rect f4813R = new Rect();
    public float R = 1.0f;
    public float v = 1.0f;
    public float c = 0.5f;
    public float e = 1.0f;

    public j3y(Context context, int i) {
        super(context, null, 0, i);
        ovn ovn = new ovn(this);
        this.f4815R = ovn;
        this.f4811R = context;
        ovn.f7024R.density = context.getResources().getDisplayMetrics().density;
        ovn.f7024R.setTextAlign(Paint.Align.CENTER);
    }

    @Override // defpackage.joe
    public final void R() {
        invalidateSelf();
    }

    public final float V() {
        int i;
        if (((this.f4813R.right - getBounds().right) - this.x) - this.Z < 0) {
            i = ((this.f4813R.right - getBounds().right) - this.x) - this.Z;
        } else if (((this.f4813R.left - getBounds().left) - this.x) + this.Z <= 0) {
            return 0.0f;
        } else {
            i = ((this.f4813R.left - getBounds().left) - this.x) + this.Z;
        }
        return (float) i;
    }

    @Override // defpackage.c18, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        float V = V();
        double sqrt = Math.sqrt(2.0d);
        canvas.scale(this.R, this.v, (((float) getBounds().width()) * 0.5f) + ((float) getBounds().left), (((float) getBounds().height()) * this.c) + ((float) getBounds().top));
        canvas.translate(V, (float) (-((sqrt * ((double) this.m)) - ((double) this.m))));
        super.draw(canvas);
        if (this.f4814R != null) {
            Rect bounds = getBounds();
            this.f4815R.f7024R.getFontMetrics(this.f4812R);
            Paint.FontMetrics fontMetrics = this.f4812R;
            int centerY = (int) (((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            ovn ovn = this.f4815R;
            if (ovn.f7025R != null) {
                ovn.f7024R.drawableState = getState();
                ovn ovn2 = this.f4815R;
                ovn2.f7025R.X(this.f4811R, ovn2.f7024R, ovn2.f7027R);
                this.f4815R.f7024R.setAlpha((int) (this.e * 255.0f));
            }
            CharSequence charSequence = this.f4814R;
            canvas.drawText(charSequence, 0, charSequence.length(), (float) bounds.centerX(), (float) centerY, this.f4815R.f7024R);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.f4815R.f7024R.getTextSize(), (float) this.L);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = (float) (this.X * 2);
        CharSequence charSequence = this.f4814R;
        return (int) Math.max(f + (charSequence == null ? 0.0f : this.f4815R.R(charSequence.toString())), (float) this.O);
    }

    public final hHK o() {
        float width = ((float) (((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.m)))) / 2.0f;
        return new hHK(new cyq((float) this.m), Math.min(Math.max(-V(), -width), width));
    }

    @Override // defpackage.c18, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        dOE doe = ((c18) this).f1920R.f6907R;
        doe.getClass();
        nBP nbp = new nBP(doe);
        nbp.c = o();
        setShapeAppearanceModel(new dOE(nbp));
    }

    @Override // defpackage.c18, android.graphics.drawable.Drawable, defpackage.joe
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }
}
