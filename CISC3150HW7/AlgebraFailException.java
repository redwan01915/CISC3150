public class AlgebraFailException extends IllegalArgumentException {

private String messageContent;

public AlgebraFailException(){

System.out.println("LookAtAlgebraOverHereException was thrown.");

}

public AlgebraFailException (String messageContent){

System.out.println("LookAtAlgebraOverHereException was thrown.");

this.messageContent = messageContent;

}

public String toString() {

String temporary = new String();

temporary += messageContent;

return temporary;

}

}