package RecycleViewAnimation.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.designs.R;

import java.util.List;

import RecycleViewAnimation.Model.News;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.Holder> {
    Context context;
    List<News> nlist;
    boolean isDark = false;

    public NewsAdapter(Context context, List<News> nlist, boolean isDark) {
        this.context = context;
        this.nlist = nlist;
        this.isDark = isDark;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_news_recycle, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.relativeLayout.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_scale_animation));
        holder.userimage.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_transition_animation));
        holder.txttitle.setText(nlist.get(position).getTitle());
        holder.txtdate.setText(nlist.get(position).getDate());
        holder.txtContent.setText(nlist.get(position).getContent());
        holder.userimage.setImageResource(nlist.get(position).getUserPic());
    }

    @Override
    public int getItemCount() {
        return nlist.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView txttitle, txtContent, txtdate;
        ImageView userimage;
        RelativeLayout relativeLayout;

        public Holder(@NonNull View itemView) {
            super(itemView);
            txttitle = itemView.findViewById(R.id.text_title);
            txtContent = itemView.findViewById(R.id.detail_text);
            txtdate = itemView.findViewById(R.id.text_date);
            userimage = itemView.findViewById(R.id.image_user);
            relativeLayout = itemView.findViewById(R.id.news_container);
            if(isDark)
            {
                setDarkTheme();
            }
        }
        private  void setDarkTheme()
        {
            relativeLayout.setBackgroundResource(R.drawable.card_dark_bg);

        }
    }

}
