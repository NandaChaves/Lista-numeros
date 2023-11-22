package ListaNUmeros;

public class Numero {
private int num;
private Numero prox;
/**
 * @param num o novo número a inserir 
 */
public Numero(int num) {
	this.num = num;
}
/**
 * @return the prox
 */
public Numero getProx() {
	return prox;
}
/**
 * @param prox the prox to set
 */
public void setProx(Numero prox) {
	this.prox = prox;
}
/**
 * @return the num
 */
public int getNum() {
	return num;
}


}
