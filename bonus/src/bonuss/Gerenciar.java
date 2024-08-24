package bonuss;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Gerenciar {

    ArrayList<Integer> normal = new ArrayList();
    ArrayList<Integer> impar = new ArrayList();
    ArrayList<Integer> par = new ArrayList();

    public void adicionarlista(int tarefa) {
        normal.add(tarefa);
        if (tarefa % 2 == 0) {
            par.add(tarefa);
        } else {
            impar.add(tarefa);
        }
    }

    public void removerlista(int tarefa) {
        normal.remove(normal.indexOf(tarefa));
        if (tarefa % 2 == 0) {
            par.remove(tarefa);
        } else {
            impar.remove(tarefa);
        }

    }

    public void modlista(int ant, int novo) {
        normal.set(normal.indexOf(ant), novo);
        if (par.contains(ant) && novo % 2 == 0) {
            par.set(par.indexOf(ant), novo);
        } else if (par.contains(ant) && novo % 2 != 0) {
            par.remove(ant);
            par.add(novo);
        } else if (impar.contains(ant) && novo % 2 != 0) {
            impar.set(impar.indexOf(ant), novo);
        } else if (impar.contains(ant) && novo % 2 == 0) {
            impar.remove(impar.indexOf(ant));
            impar.add(novo);
        }
    }

    public String getnormal() {
        String lista = "Lista\n";
        for (int i = 0; i < normal.size(); ++i) {
lista+=i+" - "+ normal.get(i)+"\n";
        }
        return lista;
    }

    public String getpar() {
        String lista = "\n lista par: \n";
        for (int i = 0; i < par.size(); ++i) {
          
          lista+=i+" - "+ par.get(i)+"\n";
        }
        return lista;
    }

    public String getimpar() {
        String lista = "\n lista impar: \n";
        for (int i = 0; i < impar.size(); ++i) {
            lista+=i+" - "+ impar.get(i)+"\n";
        }
        return lista;
    }

    public String media() {
        int numeros = 0;
        for (int i = 0; i < normal.size(); ++i) {
        numeros += normal.get(i);
        }
return "\nmedia: "+numeros/normal.size() + "\n";
    }

    public String minmax() {
        int min = normal.get(0);
        int max = normal.get(0);
        for(int i = 0; i < normal.size();++i){
            if(normal.get(i) > max){
                
            }
        }
        return "\nmax: "+ max + "\nmin:"+min;
    }
    public void sornum(){
        Collections.sort(normal);
        Collections.sort(impar);
        Collections.sort(par);
    }
    public String especifico(int tarefa){
        if(this.normal.contains(normal)) {
            return this.normal.indexOf(normal)+" - "+ this.normal.get(this.normal.indexOf(normal));
        }
        return null;
    }
    public boolean isempty(){
        return normal.isEmpty();
    }
    public boolean iscon(double tarefa){
        return normal.contains(tarefa);
    }
}
