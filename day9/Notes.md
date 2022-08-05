## Quiz questions
1. Which of the following is flase about rge protected member? _**[all options seems true]**_
- all options seems true
- classes can not be declared protected
- They are accessible by the classes of the same package
- They are accessible by the sub class of the same package 

2.Which of the following is false about polymorphism? _**[a package can only have one class file]**_
- a package can only have one class file 
- a package can have sub packages
- a specific class of a package can be imported using the dot operator
- package name and directory name are same

3. which of the following is not true for runtime polymorphism? _**[can override final methods]**_
- can not override static methods
- can override final methods
- cannot over ride private methods of parent class
- methods of child and parent class must have the same name 

---
## Regex - Regular expressions

Incase if we are to detect a pattern we use **Regex**.
Inorder to test the regex we can use [Regex Test](https://regexr.com/) and for reference use [Reference](https://www.javatpoint.com/java-regex).
- In java inorder to mark the end of String it appends with '\Z' and in regex that '\Z'==$ so append $ to match each String. 
```
public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
  Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

public static boolean validate(String emailStr) {
Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
return matcher.find();
}
```
Source for above code [StackOverflow](https://stackoverflow.com/questions/8204680/java-regex-email).<br>
with in  [ ] -brackets you specify the cases you want to match in regex. <br>
with in { }- you specify the number of characters or the length of string.
<br>
<br>
 _Position finding :_ <br>
String: Hello find the ll position in the given string also find position of l in needle string.

**Complete the Linked list nums addition on your own** _[ Work in progress ]_
<br>
### Huffman coding
### Heaps
- There are two types of heaps max heap and min heap
- **[Link to refer Max heap](https://www.gatevidyalay.com/heap-operations-max-heap-operations-examples/)**
- 
