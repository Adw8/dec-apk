package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: cVP  reason: default package */
/* loaded from: classes.dex */
public final class cVP implements InputConnection {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public d5M f2107R;

    /* renamed from: R  reason: collision with other field name */
    public final jDy f2108R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f2110R;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f2111v;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f2109R = new ArrayList();
    public boolean c = true;

    public cVP(d5M d5m, jDy jdy, boolean z) {
        this.f2108R = jdy;
        this.f2110R = z;
        this.f2107R = d5m;
    }

    public final void R(mKb mkb) {
        this.R++;
        try {
            this.f2109R.add(mkb);
        } finally {
            v();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.c;
        if (!z) {
            return z;
        }
        this.R++;
        return true;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.c;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f2109R.clear();
        this.R = 0;
        this.c = false;
        jDy jdy = this.f2108R;
        int size = jdy.R.f3175R.size();
        for (int i = 0; i < size; i++) {
            if (n3x.v(((WeakReference) jdy.R.f3175R.get(i)).get(), this)) {
                jdy.R.f3175R.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.c;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.c;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.c;
        return z ? this.f2110R : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.c;
        if (z) {
            R(new k77(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.c;
        if (!z) {
            return z;
        }
        R(new h7H(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.c;
        if (!z) {
            return z;
        }
        R(new jFD(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return v();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.c;
        if (!z) {
            return z;
        }
        R(new dbq());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        d5M d5m = this.f2107R;
        return TextUtils.getCapsMode(d5m.f2488R.R, odN.X(d5m.R), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        int i2 = 0;
        if ((i & 1) == 0) {
            z = false;
        }
        this.f2111v = z;
        if (z) {
            if (extractedTextRequest != null) {
                i2 = extractedTextRequest.token;
            }
            this.v = i2;
        }
        return gQc.F(this.f2107R);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (odN.v(this.f2107R.R)) {
            return null;
        }
        return dtx.g(this.f2107R).R;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return dtx.y(this.f2107R, i).R;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return dtx.t(this.f2107R, i).R;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.c;
        if (z) {
            z = false;
            switch (i) {
                case 16908319:
                    R(new gbI(0, this.f2107R.f2488R.R.length()));
                    break;
                case 16908320:
                    c(277);
                    break;
                case 16908321:
                    c(278);
                    break;
                case 16908322:
                    c(279);
                    break;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.c;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        break;
                }
                this.f2108R.R.v.x(new j8k(i2));
            }
            i2 = 1;
            this.f2108R.R.v.x(new j8k(i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.c;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z = this.c;
        if (!z) {
            return z;
        }
        Log.w("RecordingIC", "requestCursorUpdates is not supported");
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.c;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) this.f2108R.R.f3172R.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.c;
        if (z) {
            R(new eI5(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.c;
        if (z) {
            R(new cEC(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.c;
        if (!z) {
            return z;
        }
        R(new gbI(i, i2));
        return true;
    }

    public final boolean v() {
        int i = this.R - 1;
        this.R = i;
        if (i == 0 && (!this.f2109R.isEmpty())) {
            this.f2108R.R.f3176R.x(new ArrayList(this.f2109R));
            this.f2109R.clear();
        }
        return this.R > 0;
    }
}
