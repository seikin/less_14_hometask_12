package science.involta.less_14_hometask_12

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(private val books: List<Book>): RecyclerView.Adapter<BookAdapter.BookViewHolder>() {
    class BookViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.book_title)
        private val authorTextView: TextView = itemView.findViewById(R.id.book_author)
        private val imageView:ImageView = itemView.findViewById(R.id.book_image)

        fun bind(book: Book) {
            titleTextView.text = book.title
            authorTextView.text = book.author
            imageView.setImageResource(book.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.book_item, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = books[position]
        holder.bind(book)
    }

    override fun getItemCount(): Int {
        return books.size
    }
}