package com.example.identidade20;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Funcionarios> listaDeFuncionarios;
    private Context context;

    public Adapter(List<Funcionarios> lista, Context context){
        this.listaDeFuncionarios = lista;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itens = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista, parent, false);

        return new MyViewHolder(itens);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Funcionarios funcionarios = listaDeFuncionarios.get(position);


        holder.matricula.setText(funcionarios.getMatricula());
        holder.nome.setText(funcionarios.getNome());
        holder.setor.setText(funcionarios.getSetor());
        //todo formatar data
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(funcionarios.getDataNascimento());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sdf.format(date);
        holder.DataNascimento.setText(dataFormatada);

//       usa api picasso ou glide
        Picasso.with(context)
                .load(funcionarios.getEnderecoFoto())
                .into(holder.enderecoFoto);
    }

    @Override
    public int getItemCount() {

        return listaDeFuncionarios.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView nome;
        TextView matricula;
        TextView setor;
        TextView DataNascimento;
        TextView NOMEFUNCAO;
        TextView estadoCivil;
        TextView EMAIL;
        ImageView enderecoFoto;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.nomeFuncionario);
            matricula = itemView.findViewById(R.id.matriculaFuncionario);
            setor = itemView.findViewById(R.id.setorFuncionario);
            DataNascimento = itemView.findViewById(R.id.DataNascimentoFuncionario);
            enderecoFoto = itemView.findViewById(R.id.fotoFuncionario);
        }
    }
}
