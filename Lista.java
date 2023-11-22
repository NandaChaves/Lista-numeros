package ListaNUmeros;

public class Lista {
private Numero prim;
private Numero ultimo; 
public Lista()
{prim = null;
ultimo=null;}

/**
 * metodo para inserir numeros na lista
 */
public void inserirNumero (int num) {
	// criar o novo objeto
	Numero novo = new Numero(num);
	
	// verificar se é  primeiro valor a inserir
	if (prim==null) // a lista está vazia
		{prim=novo;
		ultimo = novo;}
	else {
		// verificar se já existe
		Numero existe = verRepetido(num);
		if (existe !=null) // o número já existe
		{// insere no fim da lista
			ultimo.setProx(novo);
			ultimo = novo; 
		}
		else // o numero não existe 
		{// pesquisar qual o menor valor na lista - a primeira ocorrencia, caso ja existam varios elementos = ao minimo
			Numero min= prim; // inicializar endereço do minimo com o valor do prim
			Numero antMin = prim;
			Numero temp=prim; // variavel para percorrer a lista
			Numero antTemp=prim; // variavel que indica sempre o endereço do anterior do temp
			while (temp!=null)
			{
				if (temp.getNum()<min.getNum()) // o numero na posição temp é < que o que era o minimo?
					{min=temp;
					antMin =antTemp;
					}
				antTemp=temp;
				temp=temp.getProx();
			}// fim while para percorrer a lista
			// verificar se o menor esta na 1ª posição da lista
			if (min==prim)
			{System.out.println("MENOR PRIM");
				novo.setProx(prim);
			 prim=novo;
			}
			else // o novo é inserido antes do menor, ou seja entre antMin e min
			{antMin.setProx(novo);
			novo.setProx(min);
			}
		}// fim eles numero nao exite
	} // fim else - lista não esta vazia
	
	
} // fim inserirNumero

/**
 *  método para verificar se o numero já existe na lista
 *  @param n o numero a analisar
 *  @return null se o valor não existe ou o endereço do elemento igual
 */
public Numero verRepetido(int n)
{
	Numero temp=prim;
	while (temp!=null && n!=temp.getNum())
		temp=temp.getProx();
	return temp;
}

/**
 * metodo para eliminar a 1ª ocorrência de um dado nº da lista
 * @param n o numero a eliminar
 */
public void elimina (int n)
{
	// ver se n é o primeiro na lista
	if (n==prim.getNum())
		{prim = prim.getProx();
		 if (prim==null)	// se a lista fica vazia entao ultimo também = null
			 ultimo =null;
		}
	else { // procurar a primeira ocorrencia do nº
	Numero temp=prim.getProx();
	Numero antTemp= prim;
	while (temp!=null && n!=temp.getNum()) // ciclo pára quando nao houver mais elementos ou quando encontrar um nº =n
		{antTemp=temp;
		temp=temp.getProx();
		}
	if (temp!=null) // quer dizer que encontrou um igual 
	{ //elimina o elemento referenciado por temp
		antTemp.setProx(temp.getProx());
	}
	else System.out.println("O numero " + n + " nao existe");
	} //fim else nao é o primeiro da lista
} // fim elimina

/**
 * metodo para imprimir os numeros na lista
 */
public void imprimeLista()
{
	Numero temp = prim;
	while (temp!=null)
		{System.out.println(temp.getNum());   // sysout + Ctrl + Espaço - tecla rapida para escrever System.out.println()
		temp=temp.getProx();}
} // fim imprimir
}
