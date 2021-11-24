package science.involta.less_14_hometask_12


//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.Fragment
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//
//class BooksRecyclerFragment : Fragment() {
//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        return inflater.inflate(R.layout.book_recycler_fragment, container, false)
//        setupRecyclerView()
//    }
//
//
//    fun setupRecyclerView() {
//        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
//        val bookAdapter = BookAdapter(generatebooklist())
//        recyclerView.adapter = bookAdapter
//        recyclerView.layoutManager = LinearLayoutManager(this)
//    }
//
//    fun generatebooklist(): List<Book> {
//        val list = mutableListOf<Book>()
//        list.add(book_01)
//        list.add(book_02)
//        list.add(book_03)
//        list.add(book_04)
//        list.add(book_05)
//        list.add(book_06)
//        list.add(book_07)
//        list.add(book_08)
//        list.add(book_09)
//        list.add(book_10)
//
//        return list
//
//    }
//
//    val book_01: Book = Book("Первые три минуты","Стивен Вайнберг", R.drawable.image00001)
//    val book_02: Book = Book("Параллельные вселенные","Митио Каку", R.drawable.image00002)
//    val book_03: Book = Book("Нереальная реальность","Карло Ровелли", R.drawable.image00003)
//    val book_04: Book = Book("Космический ландшафт","Леонард Сасскинд", R.drawable.image00004)
//    val book_05: Book = Book("История Земли первые 4,5 млрд лет","Роберт Хейзен", R.drawable.image00005)
//    val book_06: Book = Book("Охотники за нейтрино","Рей Джавардахана", R.drawable.image00006)
//    val book_07: Book = Book("Суперобъекты","Сергей Попов", R.drawable.image00007)
//    val book_08: Book = Book("Интерстеллар. Наука за кадром","Кип Торн", R.drawable.image00008)
//    val book_09: Book = Book("13,8 Млрд","Джон Гриббин", R.drawable.image00009)
//    val book_10: Book = Book("Битва при черной дыре","Стивен Хокинг", R.drawable.image00010)
//
//}