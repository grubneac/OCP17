package sealed;

public abstract sealed class Book2 {}        // Permitted subclasses are derived.
non-sealed class PrintedBook2 extends Book2 {}

sealed interface Subscribable2 {}            // Permitted subtypes are derived.
final class Ebook2 extends Book2 implements Subscribable2 {}
final class Audiobook2 extends Book2 implements Subscribable2 {}
non-sealed interface VIPSubcribable2 extends Subscribable2 {}