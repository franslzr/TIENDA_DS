/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Gabriela
 */
public class iList implements java.util.List<ListasTablas>{
       ListasTablas[] campos;
       ListasTablas[] temp;

    public iList() {
        campos=new ListasTablas[1];
    }
    
    public iList(ListasTablas y) {
        campos=new ListasTablas[1];
        campos[0]=y;
        u=1;
        }

    @Override
    public int size() {        
        return campos.length;        
    }
    @Override
    public boolean isEmpty() {
        boolean f=true;
        f=((size() <= 1) );
        return f;
    }

    @Override
    public boolean contains(Object o) {
        boolean esta=false;
        for(Object u:campos){
        esta=u.equals(o);
        }
        return esta;
    }

    @Override
    public Iterator<ListasTablas> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }//NO OCUPADO

    @Override
    public Object[] toArray() {
        return campos;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static int u=0;
    
    @Override
    public boolean add(ListasTablas e) {        
               temp=new ListasTablas[campos.length+1];
                for (int i = 0; i < campos.length; i++) {
                    temp[i] = campos[i];                    
                }
               temp[campos.length]=e;               
                campos=new ListasTablas[temp.length];
           System.arraycopy(temp, 0, campos, 0, temp.length);         
        return true;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends ListasTablas> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int index, Collection<? extends ListasTablas> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        campos=null;
    }

    @Override
    public ListasTablas get(int index) {
        return campos[index];
    }

    @Override
    public ListasTablas set(int index, ListasTablas element) {
        campos[index]=element;
        return element;
    }

    @Override
    public void add(int index, ListasTablas element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListasTablas remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(Object o) {
       int y=-1;
       for(int p=0;p<campos.length;p++){
       if(campos[p].equals(o)){
       y=p;
       }
       }
       return y;
    }

    @Override
    public int lastIndexOf(Object o) {
    return campos.length-1;   
    }

    @Override
    public ListIterator<ListasTablas> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<ListasTablas> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ListasTablas> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public ListasTablas[] getAll(){
        
        return campos;
    }
    
}
