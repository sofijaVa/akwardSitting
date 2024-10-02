https://open.kattis.com/problems/awkwardparty

Martin has invited everyone he knows to celebrate his 535th birthday, 
and a whopping n people from all over the world have accepted the invitation. 

When deciding the seating arrangement, Martin’s mother Margarethe have decided
that all the guests should be seated with maximum awkwardness; this is to ensure that
nobody has anything meaningful to discuss during dinner, and everyone would instead
silently enjoy her rather tasty coriander' soup (as the saying goes; “when the food is
good, conversation dies”).

Margarethe knows that awkwardness is maximized
if the guests are seated in a long row along a
single table, in such a way that nobody sits next
to someone speaking the same language as themselves.
Better yet, she has defined the awkwardness level of
a seating arrangement to be the minimum number of
seats separating any two guests speaking the same
language. If no two people speak the same language,
the awkwardness level is defined to be n
(the number of guests). Two seats next to each other 
are said to be separated by 1.

Given the languages spoken in a proposed seating arrangement, can you help Margarethe determine the awkwardness level?

Input

The first line contains an integer n ( 1 <= n <= 100 000) denoting the number of guests.
On the second line follows n integers, the i’th of which x_i(0 <= x_i <= 10^9) indicating the language spoken by the guest seated at position i in the proposed arrangement (each guest speaks exactly one language).

Output

A single integer, the awkwardness level of the proposed seating arrangement.
