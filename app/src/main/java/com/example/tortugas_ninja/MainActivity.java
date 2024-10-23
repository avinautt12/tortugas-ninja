package com.example.tortugas_ninja;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TortugaAdapter tortugaAdapter;
    private List<TortugaNinja> tortugas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializa el RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Crea la lista de tortugas
        tortugas = new ArrayList<>();
        tortugas.add(new TortugaNinja("Leonardo", "Katana", "Líder del equipo - Banda Azul", R.drawable.leonardo));
        tortugas.add(new TortugaNinja("Michelangelo", "Nunchaku", "El bromista - Banda Naranja", R.drawable.miguelangel)); // Cambiado a Michelangelo
        tortugas.add(new TortugaNinja("Donatello", "Bastón", "El genio - Banda Morada", R.drawable.donatello));
        tortugas.add(new TortugaNinja("Raphael", "Sai", "El rebelde - Banda Roja", R.drawable.raphael));

        // Configura el adaptador
        tortugaAdapter = new TortugaAdapter(tortugas);
        recyclerView.setAdapter(tortugaAdapter);
    }
}