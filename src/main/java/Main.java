import java.math.BigInteger;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;


public class Main {

    private void start() {

        HashMap<String, Set<BigInteger>> vars = new HashMap<String, Set<BigInteger>>();


        // Create a scanner on System.in
        
        // While there is input, read line and parse it.

        Scanner in = new Scanner(System.in);
        while ( in.hasNextLine() ) {
            System.out.println(in.nextLine());
            try {
                Scanner line = new Scanner( in.nextLine() );
                statement(line);
            } catch (APException e) {
                System.out.println(e);
            }
        }
    }

    /*
    A program is any arbitrary number of statements (commands) ended by the end of file.
    sou
    private void program() {

    }

    /*
    A statement is an assignment-statement, a print-statement or a comment-line.
     */
    private void statement(Scanner line) throws APException {
        /* statement starting with a  '/' means a comment */

        /* statement starting with a '?' means a print-statement */
        /* statement starting with a letter indicates the beginning of an assignment statement */
    }

    /*
    An assignment statement is an identifier, followed by the '=' sign, after which there is an expression, followed by an end-of-line.
     */
    private void assignment() {

    }

    /*
    A print statement is a '?' followed by an expression and ended with an end-of- line.
     */
    private void print_statement() {

    }

    /*
    A comment is a line of text that starts with the '/' -sign and is closed by an end-of-line.
     */
    private void comment() {

    }

    /*
    An identifier starts with a letter and only consists of letters and numbers.
     */
    private void identifier() {

    }

    /*
    An expression is a term, followed by zero or more terms. All terms are separated by an additive-operator.
     */
    private void expression() {

    }

    /*
    A term is a factor, followed by 0 or more factors. All factors are separated by a multiplicative-operator.
     */
    private void term() {

    }

    /*
    A factor is an identifier, a complex factor or a set.
     */
    private void factor() {

    }

    /*
    A complex factor is an expression between round brackets.
     */
    private void complex_factor() {

    }

    /*
    A set is a row of natural numbers between accolades.
     */
    private void set() {

    }

    /*
    A row of natural numbers is empty or a summation of one or more natural numbers separated by commas.
     */
    private void row_natural_numbers() {

    }

    /*
    An additive operator is a '+', a '|' or a '-' sign.
     */
    private void additive_operator() {

    }

    /*
    A multiplicative operation is a '*' -sign.
     */
    private void multiplicate_operator() {

    }

    /*
    A natural number is a positive number or zero.
     */
    private void natural_number() {

    }

    /*
    A positive number does not start with a zero, does not have a sign, and has 1 or more numbers.
     */
    private void positive_number() {

    }

    /*
    A number is a zero or not a zero.
     */
    private void number() {

    }

    /*
    Zero is the number 0.
     */
    private void zero() {

    }

    /*
    Not-zero is the number from the range 1 up to and including 9.
     */
    private void not_zero() {

    }

    /*
    A letter is a capital letter or a small letter.
     */
    private void letter() {

    }

    public static void main(String[] argv) {
        new Main().start();
    }
}
