package com.example.demo;

public class RootObject {

   // private final long id;
    private final String root;
   
	PartyObject party = new PartyObject();
	ClassificationNode cNode = new ClassificationNode();
	public ClassificationNode getcNode() {
		return cNode;
	}



	public RootObject() {
		
		
       // this.id = 2;
        this.root = "";
    }

   

	public PartyObject getParty() {
		return party;
	}



	public String getRoot() {
		return root;
	}



	/*public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
*/
}