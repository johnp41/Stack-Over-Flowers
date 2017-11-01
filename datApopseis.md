## Εισαγωγή 
Το παρών έγγραφο αποτελεί σχέδιο έγγραφου ανάλυσης απαιτήσεων της διαδικτυακής πλατφόρμας <ινσερτ ναμε>.

### Στόχος πλατφόρμας
Η πλατφόρμα <ινσερτ ναμε> αποτελεί ένα μέσο διαφήμισης παιδικών δραστηριοτήτων από ένα σύνολο παρόχων. Μέσω αυτής θα μπορούν γονείς να αναζητούν κατάλληλες δραστηριότητες και εκδηλώσεις για τα παιδιά τους, και να κάνουν κράτηση γι' αυτές που επιθυμούν, αποφέροντας στους δημιουργούς της πλατφόρμας χρηματικό κέρδος.

## Κατηγορίες χρηστών
Θα υποστηρίζονται οι παρακάτω ρόλοι χρηστών:

* **Ανώνυμος Χρήστης**
 >Πρόκειται για χρήστη πού δεν είναι εγγεγραμμένος ή συνδεδεμένος στην πλατφόρμα. 

* **Γονέας** 
>Χρήστης που συνδέεται ως γονέας, ώστε να αναζητήσει δραστηριότητες. 

* **Πάροχος Υπηρεσιών**
>Χρήστης ο οποίος θέτει έναν αριθμό εκδηλώσεων και δραστηριοτήτων ώστε να διαφημιστούν από την πλατφόρμα.

* **Διαχειριστής**
>Χρήστης με αυξημένες αρμοδιότητες για την διαχείριση της πλατφόρμας και των χρηστών που συνδέονται σε αυτήν.

<br/>
Στην συνέχεια εξηγούνται λεπτομερώς οι λειτουργίες κάθε ρόλου χρήστη:

\- **Ανώνυμος Χρήστης**  
Κάθε ανώνυμος χρήστης θα έχει την δυνατότητα να περιηγηθεί στην πλατφόρμα, να δει και να αναζητήσει δραστηριότητες. Ωστόσο δεν θα μπορεί να διαφημίζει μια δικιά του, ή να κάνει κάποια κράτηση (ή να δει τα reviews των events?). Θα μπορεί να κάνει εγγραφή στην πλατφόρμα είτε ως γονέας είτε ως πάροχος , ανάλογα με την χρήση που θέλει να κάνει στην πλατφόρμα.

\- **Γονέας**  
Ο χρήστης Γονέας πρόκειται για έναν εγγεγραμμένο χρήστη στην πλατφόρμα. Σε κάθε συνεδρία θα συνδέεται και θα αναγνωρίζεται από την πλατφόρμα, ώστε να μπορεί να την χρησιμοποιήσει σύμφωνα με τις λειτουργίες του Γονέα. Κάθε γονέας θα μπορεί να αναζητά και να κάνει κρατήσεις για εκδηλώσεις (και να δει τα reviews των events?), θα μπορεί να τροποποιεί τις πληροφορίες προφίλ του και να αγοράζει πόντους για το ηλεκτρονικό πορτοφόλι του.

\- **Πάροχος Υπηρεσιών**  
Όπως και με τον Γονέα, έτσι και ο χρήστης Πάροχος θα συνδέεται με την πλατφόρμα. Ο Πάροχος θα μπορεί να εισάγει μία καινούρια δραστηριότητα προς διαφήμιση η οποία πρωτού δημοσιευτεί θα πρέπει να εγκριθεί πρώτα από κάποιον Διαχειριστή, να καταργεί μια υπάρχουσα(???? refunds ????). Θα έχει την δυνατότητα να πλοηγείται στην πλατφόρμα βλέποντας εκδηλώσεις, όμως δεν θα έχει ηλεκτρονικό πορτοφόλι και δεν θα μπορεί να κάνει κρατήσεις(???). Τέλος θα μπορεί να επεξεργαστεί το προφίλ του με πληροφορίες της εταιρίας που (αν) εκπροσωπεί(???).

\- **Διαχειριστής 1** (????δεν εχω ιδεα πως υλοποιειται και ισως δεν βολευει τοσο αλλα ειναι ισως πιο κοντα στην πραγματικοτητα????)  
Ο Διαχειριστής αποτελεί ειδικό τύπο χρήστη ο οποίος μπορεί να: 
Δημιουργεί νέους διαχειριστές χρηστών, να τους διαγράφει και να τροποποιεί τα δικαιώματα τους
Κλειδώσει κάποιον λογαριασμό Γονέα/Παρόχου 
Διαγράψει κακόβουλα ή απρεπή reviews
Κάνει reset τον κωδικό σύνδεσης ενός χρήστη (Γονέα/Παρόχου) κατ' απαίτησή του
Να αποσύρουν διαφημιζόμενες δραστηριότητες από την πλατφόρμα(????refunds????) και
Να πλοηγούνται στην πλατφόρμα με πλήρη δικαιώματα χωρίς όμως να κάνουν κρατήσεις ή να διαφημίζουν δραστηριότητες 
Διαθέτουν προφίλ που μπορούν να επεξεργάζονται (???)


## Επιχειρησιακά ζητήματα

### Αγορά και πολιτική εισιτηρίων  
Οι Γονείς, με την χρήση πιστωτικών καρτών (ή και άλλων μέσων ηλεκτρονικής αγοράς) αγοράζουν εισιτήρια για εκδηλώσεις που επιθυμούν. Οι αγορές εισιτηρίων γίνονται είτε με απευθείας χρέωση, είτε μέσω αγοράς πόντων και την έπειτα αξιοποίηση αυτών. Κάθε εισιτήριο είναι ατομικό και δεν υπάρχουν (????) πακέτα εισιτηρίων/ειδικά εισιτήρια πολλαπλών χρήσεων. Μπορούν να γίνουν επιστροφές χρημάτων, αλλά μόνο ύπο την μορφή πόντων οι οποίοι μπορούν να επαναχρησιμοποιηθούν. Τα refunds γίνονται είτε κατ' απαίτηση του Γονέα, σε εύλογο χρονικό διάστημα πριν την έναρξη της εκδήλωσης, είτε αυτομάτως λόγω της ακύρωσης του event από έναν Πάροχο/Διαχειριστή.

### Πόντοι και ηλεκτρονικό πορτοφόλι
Οι χρήστες Γονείς θα διαθέτουν ένα ηλεκτρονικό πορτοφόλι πόντων. Θα μπορούν να γεμίσουν το πορτοφόλι αγοράζοντας πόντους με την χρήση πιστωτικών/χρεωστικών/προπληρωμένων καρτών, σύμφωνα με προυπάρχοντα πακέτα αγοράς αυξανόμενης αναλογίας. Με αυτούς τους πόντους θα μπορούν να κάνουν κρατήσεις για δραστηριότητες. Επίσης τα refunds θα γίνονται σε μορφή πόντων. Επίσης, με την κάθε αγορά εισιτηρίου τους αποδίδονται επιπλέον πόντοι για να τους χρησιμοποιήσουν στις επόμενες αγορές τους.

### Αποζημιώσεις
Αποζημιώσεις γίνονται σε μορφή πόντων μόνο εφόσον ένας Πάροχος ή Διαχειριστής αποσύρει μια δραστηριότητα, ή εάν ο Γονέας ακυρώσει την κράτηση εντός χρονικών πλαισίων που καθορίζονται από τον εκάστοτε πάροχο (mild/strict πολιτική ακυρώσεων).

### 

## Περιορισμοί - Παραδοχές
Το σύστημα έχει τους παρακάτω περιορισμούς:

* Γεωγραφικοί, πχ εντός Αθήνας/Ελλάδας
* --
* --

Επίσης θεωρούμε πως:

* Για κάθε πληρωμή που γίνεται, κρατάμε εμείς το πληρωτέο ποσό. Οι Πάροχοι πληρώνονται από εμάς με το πέρας της εκδήλωσης και όχι απευθείας με την κάθε αγορά εισιτηρίου. Με αυτόν τον τρόπο μπορούμε να εξασφαλίσουμε το refund των Γονέων (πάντα υπό την μορφή πόντων), εφόσον η εκάστοτε πολιτική επιστροφής το επιτρέπει.
* Έχουμε μόνο απλά εισιτήρια μιας εκδήλωσης και όχι άλλες προσφορές.
* Οι ανώνυμοι χρήστες δεν μπορούν να δουν τα στοιχεία επικοινωνίας των Παρόχων
* Οι διάφοροι χρήστες δεν μπορούν να επικοινωνήσουν μεταξύ τους μέσω της πλατφόρμας (???)
* Οι Πάροχοι ανταλλάσσουν μέρος της αξίας του εισιτηρίου (έστω 10%) για την πιθανοτικά βέβαιη πώληση εισιτηρίων που παρέχουμε. <-- Κέρδος Πλατφόρμας