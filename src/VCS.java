

/*
Objectives for Today

By the end of today, you will:
   * Understand how Version Control Systems allow us to save "checkpoints" as we work through writing code.
   * Define common terms associated with version control.
   * Identify ways to interact with the VCS "git" from the command line and through the IDE.
 */


/*
Vocabulary for the Day

Version Control System - A Version Control System (VCS) is a piece of software that is able to keep track of a history
of changes. VCS software comes in two major variants: centralized version control, which keeps track of a linear
history on a single server, and distributed version control, which keeps track of separate timelines each place the
software is duplicated.


Commit - The smallest unit of change in a VCS is called a "commit". A commit is stored as a list of differences between
a previous version and the new current version, along with metadata about who made a change and when.

Repository - A repository is the name for an entire commit history related to a particular software project.

Branch - A series of commits that form a linear timeline is called a 'branch'. All branches of the same repository
share a single common ancestor.

 */




public class VCS {


    public static void main(String[] args) {
        /*
        As we write code, we often find situations where we are afraid to make a change because we're not entirely sure
        of its effects.


        Often, this ends up incentivizing us to create many copies of our code, or many copies of entire files with
        version information in the filename.
         */

        FizzBuzz(100);

    }


/*
    public static void FizzBuzz_attempt1(int count_to) {
        for ( int i=1; i<=count_to; i++) {

            if ( i % 3 == 0 ) {
                System.out.println("Fizz");
            } else if ( i % 5 == 0 ) {
                System.out.println("Buzz");
            } else if ( i % 3 == 0 && i % 5 == 0 ) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }

    NOTE: THIS DOESN'T WORK PLEASE FIX!!!!!11!
 */

    public static void FizzBuzz(int count_to) {
        for ( int i=1; i<=count_to; i++) {

            if ( i % 3 == 0 ) {
                System.out.println("Fizz");
            } else if ( i % 5 == 0 ) {
                System.out.println("Buzz");
            } else if ( i % 3 == 0 && i % 5 == 0 ) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }

}
