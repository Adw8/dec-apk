package defpackage;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import com.termux.view.TerminalView;

/* renamed from: hRx  reason: default package */
/* loaded from: classes.dex */
public final class hRx extends BaseInputConnection {
    public final /* synthetic */ TerminalView R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public hRx(TerminalView terminalView, View view) {
        super(view, true);
        this.R = terminalView;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x0051 */
    public final void R(Editable editable) {
        boolean z;
        this.R.m();
        int length = editable.length();
        int i = 0;
        while (i < length) {
            char charAt = editable.charAt(i);
            boolean isHighSurrogate = Character.isHighSurrogate(charAt);
            int i2 = charAt;
            if (isHighSurrogate) {
                i++;
                i2 = i < length ? Character.toCodePoint(charAt, editable.charAt(i)) : 65533;
            }
            this.R.f2430R.getClass();
            if (i2 > 31 || i2 == 27) {
                z = false;
            } else {
                int i3 = i2;
                if (i2 == 10) {
                    i3 = 13;
                }
                switch (i3) {
                    case 28:
                        i2 = 92;
                        break;
                    case 29:
                        i2 = 93;
                        break;
                    case 30:
                        i2 = 94;
                        break;
                    case 31:
                        i2 = 95;
                        break;
                    default:
                        i2 = (i3 == 1 ? 1 : 0) + 96;
                        break;
                }
                z = true;
            }
            this.R.X(0, i2 == 1 ? 1 : 0, z, false);
            i++;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        if (TerminalView.v) {
            mT0 mt0 = this.R.f2430R;
            ((lV4) mt0).R("IME: commitText(\"" + ((Object) charSequence) + "\", " + i + ")");
        }
        super.commitText(charSequence, i);
        if (this.R.f2428R == null) {
            return true;
        }
        Editable editable = getEditable();
        R(editable);
        editable.clear();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        if (TerminalView.v) {
            mT0 mt0 = this.R.f2430R;
            ((lV4) mt0).R("IME: deleteSurroundingText(" + i + ", " + i2 + ")");
        }
        KeyEvent keyEvent = new KeyEvent(0, 67);
        for (int i3 = 0; i3 < i; i3++) {
            sendKeyEvent(keyEvent);
        }
        return super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        if (TerminalView.v) {
            ((lV4) this.R.f2430R).R("IME: finishComposingText()");
        }
        super.finishComposingText();
        R(getEditable());
        getEditable().clear();
        return true;
    }
}
