package defpackage;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b8r  reason: default package */
/* loaded from: classes.dex */
public final class b8r extends oE_ {
    public static boolean t(Transition transition) {
        return !oE_.Z(transition.getTargetIds()) || !oE_.Z(transition.getTargetNames()) || !oE_.Z(transition.getTargetTypes());
    }

    @Override // defpackage.oE_
    public final void C(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            oE_.L(view, rect);
            ((Transition) obj).setEpicenterCallback(new ik3(rect, 0));
        }
    }

    @Override // defpackage.oE_
    public final void H(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new p4y(view, arrayList));
    }

    @Override // defpackage.oE_
    public final void N(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new ik3(rect, 1));
    }

    @Override // defpackage.oE_
    public final Object O(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // defpackage.oE_
    public final void P(Object obj, a3 a3Var, dX dXVar) {
        ((Transition) obj).addListener(new aXH(dXVar));
    }

    @Override // defpackage.oE_
    public final void R(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // defpackage.oE_
    public final void U(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new j9J(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.oE_
    public final boolean X(Object obj) {
        return obj instanceof Transition;
    }

    @Override // defpackage.oE_
    public final void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // defpackage.oE_
    public final void g(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            i(transitionSet, arrayList, arrayList2);
        }
    }

    public final void i(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                i(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!t(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget((View) arrayList2.get(i));
                i++;
            }
            int size2 = arrayList.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    transition.removeTarget((View) arrayList.get(size2));
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.oE_
    public final void j(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            oE_.e((View) arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        v(transitionSet, arrayList);
    }

    @Override // defpackage.oE_
    public final Object m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // defpackage.oE_
    public final void v(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    v(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!t(transition) && oE_.Z(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // defpackage.oE_
    public final Object x(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // defpackage.oE_
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}
