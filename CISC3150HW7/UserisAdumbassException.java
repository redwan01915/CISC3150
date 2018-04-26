public class UserisAdumbassException extends IllegalArgumentException {

String messageContent;

public UserisAdumbassException(){

System.out.println("UserisAdumbassException was thrown.");

}

public UserisAdumbassException(String messageContent){

System.out.println("UserisAdumbassException was thrown.");

this.messageContent = messageContent;

}

public String toString() {

String temporary = new String();

temporary += messageContent;

return temporary;

}

}

