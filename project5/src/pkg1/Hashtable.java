    
package pkg1;

public class Hashtable
{
	private List[] hashArray;	//array of lists
	private int arraySize;
	int size = 311;

	public Hashtable(int size) {
		arraySize = size;
		hashArray = new List[arraySize];
		for(int j=0; j<arraySize; j++)
			hashArray[j] = new List();
	}
	public void displayTable() {
		for(int j=0; j<arraySize; j++) {
			System.out.print(j + ". ");
			hashArray[j].displayList(); //displayList will be created
		}
	}
	 public static int getIntval(String name) {

	        String result = "";

	        for (int i = 0; i < name.length(); i++) {

	            char ch = name.charAt(i);

	            if (Character.isLetter(ch)) {
	                char initialCharacter = Character.isUpperCase(ch) ? 'A' : 'a';
	                result = result.concat(String.valueOf((ch - initialCharacter + 1)));
	            }
	            else result = result + ch;
	        }

	        return Integer.parseInt(result);
 }
	public int hashFunc(int result) {	
		return result % arraySize;
	}
	public void insert(String name, double gdpPerCapitia) {
		 int hashVal = hashFunc(getIntval(name));
		hashArray[hashVal].insertFirst(name, gdpPerCapitia);
	}
	public void delete(String name) {
		int hashVal = hashFunc(getIntval(name));
		hashArray[hashVal].delete(name);
		System.out.println("This country has been deleted: " + name + "\n");
	}
	public Node find(String name) {
		int hashVal = hashFunc(getIntval(name));
		Node theLink = hashArray[hashVal].find(name);
		System.out.println("This country has been found: " + name + "\n");
		return theLink;
	}
	public void printFreeAndCollisions() {
		int free = 0;
		int col = 0;
		for(int i = 0; i<size; i++) {
			if(hashArray[i] == null) { 
			free++;
		}
			else if(hashArray[i].first.nextNode != null) {
					
				col++;
			}
			System.out.println("there are" + free + "spaces available and" + col +"collisions in the hashtable\n" );
		}
	}
}