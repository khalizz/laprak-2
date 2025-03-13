class Health {
    private int HP;

    public Health(int initialHP) {
        this.HP = initialHP;
    }

    public void kenaDamage(int damage) {
        this.HP -= damage;
        if (this.HP < 0) {
            this.HP = 0;
        }
    }

    public int getHp() {
        return this.HP;
    }
}

class Weapon {
    private String nama;
    private int damageDeal;

    public Weapon(String nama, int damageDeal) {
        this.nama = nama;
        this.damageDeal = damageDeal;
    }

    public String getNama() {
        return this.nama;
    }

    public int getDamageDeal() {
        return this.damageDeal;
    }
}

class Hero {
    private String nama;
    private Health darah;
    private Weapon senjata;

    public Hero(String nama, Weapon senjata, int initialHP) {
        this.nama = nama;
        this.senjata = senjata;
        this.darah = new Health(initialHP);
    }

    public void serang() {
        System.out.println(nama + " menyerang dengan senjata " + senjata.getNama() + 
                           " dengan damage sebesar: " + senjata.getDamageDeal());
    }

    public void tampilkanDarah() {
        System.out.println(nama + " memiliki darah sebanyak " + darah.getHp());
    }

    public void kenaSerangan(int damage) {
        darah.kenaDamage(damage);
        System.out.println(nama + " terkena serangan! Sisa darah: " + darah.getHp());
    }
    
        public String getNama() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getNama'");
        }
    }
    
    class Trainer {
        private String nama;
    
        public Trainer(String nama) {
            this.nama = nama;
        }
    
        public void latih(Hero hero) {
            System.out.println("Trainer " + nama + " sedang melatih " + hero.getNama());
    }
}

public class hubungan {
    public static void main(String[] args) {
        Weapon senjata = new Weapon("enma", 2000);
        Hero player = new Hero("zoro", senjata, 7000);
        Trainer trainer = new Trainer("Master rosi");

        player.serang();
        System.out.println();
        player.tampilkanDarah();
        System.out.println();
        
        // Simulasi kena serangan
        player.kenaSerangan(2000);
        System.out.println();
        
        // Pelatihan oleh Trainer
        trainer.latih(player);
    }
}