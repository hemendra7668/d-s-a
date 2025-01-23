import java.util.ArrayList;

public class Heap {
    
    private ArrayList <Integer> arl = ArrayList<>();


    public void add(int val){
arl.add(val);

    }

     void swap(int index, int pi){

    }
//create heap is called the heapify
    public void unheapify(){
        int ci;
        int pi =(ci-1)/2;
        if(arl.get(pi)<arl.get(ci))
        {

        }
    }

    public void display(){
System.out.println(arl);
    }


    public int remove()
    {
 int rv =arl.get(0);
swap(0,arl.size()-1);
arl.remove(arl.size()-1);
downheapify(0);
return rv;
    }

public void downheapify(int pi)
{
    int lci= 2*pi+2;
    int rci = 2*pi-2;
    int mini = pi;
    if(lci<arl.size() && arl.get(mini)>arl.get(lci)){
        mini=lci;
    }
    if (lci<arl.size() && arl.get(mini)>arl.get(rci)) {
        mini=rci;
    }
    if (mini!=pi) {
        swap(mini, pi);
        downheapify(mini);
    }
}

}
