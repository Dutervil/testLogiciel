package com.wadson.app;



import java.util.Arrays;

public class Rarray {

    private Object[] target;
    private int size = 0;


    public Rarray(int capacite) throws RarrayError {
        if(capacite < 0){
            throw new RarrayError();
        }else {
            target = new Object[capacite];
            size = capacite;
        }
    }

    public void add(Object elt) {
        Object[] targetNew = new Object[target.length + 1];
        for (int i = 0; i < target.length; i++){
            targetNew[i] = target[i];
        }
        targetNew[targetNew.length - 1] = elt;
        clear();
        target = targetNew;
    }

    public boolean remove(Object elt) {

        int j = 0;
        int index = -1;
        for (int i = 0; i < target.length; i++) {
            if (target[i] == null && elt == null) {
                index = i;
                break;
            } else if (target[i].equals(elt)) {
                index = i;
                break;
            }
        }
        int nbOc = nbOcc(elt);
        if (nbOc > 0) {
            Object[] targetNew1 = new Object[index];
            Object[] targetNew2 = new Object[target.length - targetNew1.length - 1];
            for (int i = 0; i < targetNew1.length; i++) {
                targetNew1[i] = target[i];
            }
            for (int i = 0; i < targetNew2.length; i++) {
                targetNew2[i] = target[i + index + 1];
            }
            clear();
            target = new Object[targetNew1.length + targetNew2.length];
            for (int i = 0; i < targetNew1.length; i++) {
                target[i] = targetNew1[i];
            }
            for (int i = 0; i < targetNew2.length; i++) {
                target[targetNew1.length + i] = targetNew1[i];
            }
            for (int i = 0; i < targetNew1.length; i++) {
                targetNew1[i] = null;
            }
            for (int i = 0; i < targetNew2.length; i++) {
                targetNew2[i] = null;
            }
        }
        return nbOc > 0;
    }

    public boolean removeAll(Object elt) {
        int nbOc = nbOcc(elt);
        Object[] targetNew = new Object[target.length - nbOc];
        int j = 0;
        for (int i = 0; i < target.length; i++) {
            if (target[i] == null && elt == null) {
                continue;
            } else if (target[i].equals(elt)) {
                continue;
            }
            targetNew[j] = target[i];
            j++;
        }
        clear();
        target = targetNew;
        return nbOc > 0;
    }

    public void clear() {
        for (int i = 0; i < target.length; i++) {
            target[i] = null;
        }
        target = new Object[0];
    }

    public boolean contains(Object elt) {
        for (Object o : target) {
            if (o == null && elt == null) {
                return true;
            } else if (o != null && o.equals(elt)) {
                return true;
            }
        }
        return false;
    }

    public int nbOcc(Object elt) {
        int occ = 0;
        for (Object o : target) {
            if (o == null && elt == null) {
                occ++;
            } else if (o.equals(elt)) {
                occ++;
            }
        }
        return occ;
    }

    public int size() {
        return this.target.length;
    }
}
