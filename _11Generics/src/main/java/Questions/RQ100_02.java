package Questions;

import java.util.*;
public class RQ100_02 {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("Java", "only", "promotes", "fun");
        Collection<String> resultList = delete4LetterWords(lst);
    }

    // (1) INSERT METHOD HEADER HERE
    static <E extends CharSequence>
    Collection<E> delete4LetterWords(Collection<E> words)
    {
        Collection<E> permittedWords = new ArrayList<>();
        for (E word : words) {
            if (word.length() != 4) permittedWords.add(word);
        }
        return permittedWords;
    }
}

/*
a.
static <E extends CharSequence>
Collection<? extends CharSequence> delete4LetterWords(Collection<E> words)
*/

/*
b.
static <E extends CharSequence>
List<E> delete4LetterWords(Collection<E> words)
*/

/*
c.
static <E extends CharSequence>
Collection<E> delete4LetterWords(Collection<? extends CharSequence> words)
*/


/*
d.
static <E extends CharSequence>
List<E> delete4LetterWords(Collection<? extends CharSequence> words)
*/


/*
e.
static <E extends CharSequence>
Collection<E> delete4LetterWords(Collection<E> words)
*/

/*
f.
static <E super CharSequence>
        Collection<E> delete4LetterWords(Collection<E> words)
*/
