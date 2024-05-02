package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: kpW  reason: default package */
/* loaded from: classes.dex */
public final class kpW extends MenuInflater {
    public static final Class[] R;
    public static final Class[] v;

    /* renamed from: R  reason: collision with other field name */
    public Context f5437R;

    /* renamed from: R  reason: collision with other field name */
    public Object f5438R;

    /* renamed from: R  reason: collision with other field name */
    public final Object[] f5439R;

    /* renamed from: v  reason: collision with other field name */
    public final Object[] f5440v;

    static {
        Class[] clsArr = {Context.class};
        R = clsArr;
        v = clsArr;
    }

    public kpW(Context context) {
        super(context);
        this.f5437R = context;
        Object[] objArr = {context};
        this.f5439R = objArr;
        this.f5440v = objArr;
    }

    public static Object R(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? R(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:20:0x000a */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kpW */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: android.content.res.XmlResourceParser */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.res.XmlResourceParser, org.xmlpull.v1.XmlPullParser] */
    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        XmlResourceParser xmlResourceParser = menu instanceof p1a;
        if (xmlResourceParser == 0) {
            super.inflate(i, menu);
            return;
        }
        try {
            xmlResourceParser = 0;
            try {
                try {
                    xmlResourceParser = this.f5437R.getResources().getLayout(i);
                    v(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != 0) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:95:0x0254 */
    public final void v(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ColorStateList colorStateList;
        oL6 ol6 = new oL6(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException(opT.H("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                z = z;
                z = z;
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                            eventType = xmlResourceParser.next();
                            z = z;
                            z2 = z2;
                        } else if (name2.equals("group")) {
                            ol6.f6751R = 0;
                            ol6.f6765v = 0;
                            ol6.c = 0;
                            ol6.e = 0;
                            ol6.f6759R = true;
                            ol6.f6768v = true;
                            z = z;
                        } else if (name2.equals("item")) {
                            z = z;
                            if (!ol6.f6762c) {
                                c5B c5b = ol6.f6755R;
                                if (c5b == null || !c5b.R.hasSubMenu()) {
                                    ol6.f6762c = true;
                                    ol6.v(ol6.f6754R.add(ol6.f6751R, ol6.X, ol6.O, ol6.f6756R));
                                    z = z;
                                } else {
                                    ol6.f6762c = true;
                                    ol6.v(ol6.f6754R.addSubMenu(ol6.f6751R, ol6.X, ol6.O, ol6.f6756R).getItem());
                                    z = z;
                                }
                            }
                        } else {
                            z = z;
                            if (name2.equals("menu")) {
                                z = true;
                            }
                        }
                    }
                    eventType = xmlResourceParser.next();
                    z = z;
                    z2 = z2;
                } else {
                    if (!z2) {
                        String name3 = xmlResourceParser.getName();
                        if (name3.equals("group")) {
                            TypedArray obtainStyledAttributes = ol6.f6758R.f5437R.obtainStyledAttributes(attributeSet, iTI.j);
                            ol6.f6751R = obtainStyledAttributes.getResourceId(1, 0);
                            ol6.f6765v = obtainStyledAttributes.getInt(3, 0);
                            ol6.c = obtainStyledAttributes.getInt(4, 0);
                            ol6.e = obtainStyledAttributes.getInt(5, 0);
                            ol6.f6759R = obtainStyledAttributes.getBoolean(2, true);
                            ol6.f6768v = obtainStyledAttributes.getBoolean(0, true);
                            obtainStyledAttributes.recycle();
                            z = z;
                        } else if (name3.equals("item")) {
                            CV Y = CV.Y(ol6.f6758R.f5437R, attributeSet, iTI.g);
                            ol6.X = Y.y(2, 0);
                            ol6.O = (Y.P(5, ol6.f6765v) & -65536) | (Y.P(6, ol6.c) & 65535);
                            ol6.f6756R = Y.V(7);
                            ol6.f6766v = Y.V(8);
                            ol6.L = Y.y(0, 0);
                            String t = Y.t(9);
                            ol6.R = t == null ? 0 : t.charAt(0);
                            ol6.Z = Y.P(16, 4096);
                            String t2 = Y.t(10);
                            ol6.v = t2 == null ? 0 : t2.charAt(0);
                            ol6.m = Y.P(20, 4096);
                            if (Y.o(11)) {
                                ol6.x = Y.Z(11, false) ? 1 : 0;
                            } else {
                                ol6.x = ol6.e;
                            }
                            ol6.f6764e = Y.Z(3, false);
                            ol6.f6760X = Y.Z(4, ol6.f6759R);
                            ol6.f6750O = Y.Z(1, ol6.f6768v);
                            ol6.H = Y.P(21, -1);
                            ol6.f6767v = Y.t(12);
                            ol6.U = Y.y(13, 0);
                            ol6.f6757R = Y.t(15);
                            String t3 = Y.t(14);
                            boolean z3 = t3 != null;
                            if (z3 && ol6.U == 0 && ol6.f6757R == null) {
                                ol6.f6755R = (c5B) ol6.R(t3, v, ol6.f6758R.f5440v);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                ol6.f6755R = null;
                            }
                            ol6.f6761c = Y.V(17);
                            ol6.f6763e = Y.V(22);
                            if (Y.o(19)) {
                                ol6.f6753R = mTA.v(Y.P(19, -1), ol6.f6753R);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                ol6.f6753R = null;
                            }
                            if (Y.o(18)) {
                                ol6.f6752R = Y.m(18);
                            } else {
                                ol6.f6752R = colorStateList;
                            }
                            Y.z();
                            ol6.f6762c = false;
                            z = z;
                        } else {
                            if (name3.equals("menu")) {
                                ol6.f6762c = true;
                                SubMenu addSubMenu = ol6.f6754R.addSubMenu(ol6.f6751R, ol6.X, ol6.O, ol6.f6756R);
                                ol6.v(addSubMenu.getItem());
                                v(xmlResourceParser, attributeSet, addSubMenu);
                            } else {
                                str = name3;
                                z2 = true;
                            }
                            eventType = xmlResourceParser.next();
                            z = z;
                            z2 = z2;
                        }
                    }
                    eventType = xmlResourceParser.next();
                    z = z;
                    z2 = z2;
                }
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }
}
