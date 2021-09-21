
public class ListadeEspera extends Ligacao
//uso de lista de prioridade max heap;
//aqui a categoria tem peso em ficar na prioridade;
{
    private int[] Heap;
    private int tamanho;
    private int maxsize;
    
    public ListadeEspera(int tamMax)
    {
        this.maxsize = tamMax;
        this.tamanho = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MAX_VALUE;
    }

    private int parent(int pos) { return pos / 2; }
    private int leftChild(int pos) { return (2 * pos); }
    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }
  
    private boolean isLeaf(int pos)
    {
        if (pos > (tamanho / 2) && pos <= tamanho) {
            return true;
        }
        return false;
    }
  
    private void swap(int fpos, int spos)
    {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }
    private void HeapMax(int pos)
    {
        if (isLeaf(pos))
            return;
  
        if (Heap[pos] < Heap[leftChild(pos)]
            || Heap[pos] < Heap[rightChild(pos)]) {
  
            if (Heap[leftChild(pos)]
                > Heap[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                HeapMax(leftChild(pos));
            }
            else {
                swap(pos, rightChild(pos));
                HeapMax(rightChild(pos));
            }
        }
    }

    public void add(int element)
    {
        Heap[++tamanho] = element;
        int current = tamanho;
        while (Heap[current] > Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }  
  
    public void imprimir()
    {
    	System.out.println("Lista de espera:");
        for (int i = 1; i <= tamanho / 2; i++) {
            System.out.print(
                " PAI : " + Heap[i]
                + " +-DIREITA : " + Heap[2 * i] + "\n"
                + "           +-ESQUERDA :" + Heap[2 * i + 1]);
            System.out.println("\n");
        }
    }
  
    // Remove an element from max heap
    public int extractMax()
    {
        int popped = Heap[1];
        Heap[1] = Heap[tamanho--];
        HeapMax(1);
        return popped;
        
    }
}