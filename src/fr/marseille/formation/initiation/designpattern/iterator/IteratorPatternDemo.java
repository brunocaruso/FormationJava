package fr.marseille.formation.initiation.designpattern.iterator;

public class IteratorPatternDemo {
	public static void main(String[] args) {
		NameRepository nameRepository = new NameRepository();
	
		for (Iterator iter = nameRepository.getIterator() ; iter.hasNext(); ) {
			String name = (String)iter.next();
			System.out.println("Name : " + name);
		}
	}
}
