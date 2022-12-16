/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CurrencyConverterProject;
import static javax.swing.ScrollPaneConstants.*;
import java.text.NumberFormat;
import java.util.Locale;

public class ShowCryptoCurrency extends javax.swing.JFrame {

    /**
     * Creates new form ShowCurrency
     */
    public ShowCryptoCurrency() {
        initComponents();                                                           // Removes the horizontal scrollbar. Code from:
        populateCurrencies(CurrencyDropdown.getSelectedItem().toString());
        ValuesScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER); // https://stackoverflow.com/questions/1727840/disable-horizontal-scroll-in-jscrollpane
    }
    // This method will fill the live value of cryptocurrencies using data from the api
    private void populateCurrencies(String currency) {
        LivePrices data = new LivePrices();
        String liveBitcoinPrice = data.getCryptoPrice("bitcoin", currency); // API calls
        String liveEthereumPrice = data.getCryptoPrice("ethereum", currency);
        String liveBNBPrice = data.getCryptoPrice("binancecoin", currency);
        String liveXRPPrice = data.getCryptoPrice("ripple", currency);
        String liveDogecoinPrice = data.getCryptoPrice("dogecoin", currency);
        String liveCardanoPrice = data.getCryptoPrice("cardano", currency);
        String livePolygonPrice = data.getCryptoPrice("matic-network", currency);
        String livePolkadotPrice = data.getCryptoPrice("polkadot", currency);
        String liveLitecoinPrice = data.getCryptoPrice("litecoin", currency);
        String liveShibaInuPrice = data.getCryptoPrice("shiba-inu", currency); 
        BitcoinPrice.setText(liveBitcoinPrice); // Set text after API call
        EthereumPrice.setText(liveEthereumPrice);
        BNBPrice.setText(liveBNBPrice);
        XRPPrice.setText(liveXRPPrice);
        DogecoinPrice.setText(liveDogecoinPrice);
        CardanoPrice.setText(liveCardanoPrice);
        PolygonPrice.setText(livePolygonPrice);
        PolkadotPrice.setText(livePolkadotPrice);
        LitecoinPrice.setText(liveLitecoinPrice);
        ShibaInuPrice.setText(liveShibaInuPrice);    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        ValuesScrollPane = new javax.swing.JScrollPane();
        CurrencyContainer = new javax.swing.JPanel();
        ListPanel = new javax.swing.JPanel();
        BitcoinPrice = new javax.swing.JLabel();
        BitcoinLabel = new javax.swing.JLabel();
        ListPanel1 = new javax.swing.JPanel();
        EthereumPrice = new javax.swing.JLabel();
        EthereumLabel = new javax.swing.JLabel();
        ListPanel2 = new javax.swing.JPanel();
        BNBPrice = new javax.swing.JLabel();
        BNBLabel = new javax.swing.JLabel();
        ListPanel3 = new javax.swing.JPanel();
        XRPPrice = new javax.swing.JLabel();
        XRPLabel = new javax.swing.JLabel();
        ListPanel4 = new javax.swing.JPanel();
        DogecoinPrice = new javax.swing.JLabel();
        DogecoinLabel = new javax.swing.JLabel();
        ListPanel5 = new javax.swing.JPanel();
        CardanoPrice = new javax.swing.JLabel();
        CardanoLabel = new javax.swing.JLabel();
        ListPanel6 = new javax.swing.JPanel();
        PolygonPrice = new javax.swing.JLabel();
        PolygonLabel = new javax.swing.JLabel();
        ListPanel7 = new javax.swing.JPanel();
        PolkadotPrice = new javax.swing.JLabel();
        PolkadotLabel = new javax.swing.JLabel();
        ListPanel8 = new javax.swing.JPanel();
        LitecoinPrice = new javax.swing.JLabel();
        LitecoinLabel = new javax.swing.JLabel();
        ListPanel9 = new javax.swing.JPanel();
        ShibaInuPrice = new javax.swing.JLabel();
        ShibaInuLabel = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JButton();
        CurrencyDropdown = new javax.swing.JComboBox<>();
        BackButton = new javax.swing.JButton();
        BackButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Live Crypto Currency Rates");

        ListPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        BitcoinPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BitcoinPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BitcoinPrice.setText("Loading...");

        BitcoinLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BitcoinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BitcoinLabel.setText("Bitcoin");

        javax.swing.GroupLayout ListPanelLayout = new javax.swing.GroupLayout(ListPanel);
        ListPanel.setLayout(ListPanelLayout);
        ListPanelLayout.setHorizontalGroup(
            ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BitcoinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(BitcoinPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ListPanelLayout.setVerticalGroup(
            ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BitcoinPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BitcoinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ListPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        EthereumPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EthereumPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EthereumPrice.setText("Loading...");

        EthereumLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EthereumLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EthereumLabel.setText("Ethereum");

        javax.swing.GroupLayout ListPanel1Layout = new javax.swing.GroupLayout(ListPanel1);
        ListPanel1.setLayout(ListPanel1Layout);
        ListPanel1Layout.setHorizontalGroup(
            ListPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EthereumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(EthereumPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ListPanel1Layout.setVerticalGroup(
            ListPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ListPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EthereumPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EthereumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ListPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        BNBPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BNBPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BNBPrice.setText("Loading...");

        BNBLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BNBLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BNBLabel.setText("BNB");

        javax.swing.GroupLayout ListPanel2Layout = new javax.swing.GroupLayout(ListPanel2);
        ListPanel2.setLayout(ListPanel2Layout);
        ListPanel2Layout.setHorizontalGroup(
            ListPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BNBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(BNBPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ListPanel2Layout.setVerticalGroup(
            ListPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ListPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BNBPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BNBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ListPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        XRPPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        XRPPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        XRPPrice.setText("Loading...");

        XRPLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        XRPLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        XRPLabel.setText("XRP");

        javax.swing.GroupLayout ListPanel3Layout = new javax.swing.GroupLayout(ListPanel3);
        ListPanel3.setLayout(ListPanel3Layout);
        ListPanel3Layout.setHorizontalGroup(
            ListPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(XRPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(XRPPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ListPanel3Layout.setVerticalGroup(
            ListPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ListPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(XRPPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(XRPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ListPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        DogecoinPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DogecoinPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DogecoinPrice.setText("Loading...");

        DogecoinLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DogecoinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DogecoinLabel.setText("Dogecoin");

        javax.swing.GroupLayout ListPanel4Layout = new javax.swing.GroupLayout(ListPanel4);
        ListPanel4.setLayout(ListPanel4Layout);
        ListPanel4Layout.setHorizontalGroup(
            ListPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DogecoinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(DogecoinPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ListPanel4Layout.setVerticalGroup(
            ListPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ListPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DogecoinPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DogecoinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ListPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        CardanoPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CardanoPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CardanoPrice.setText("Loading...");

        CardanoLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CardanoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CardanoLabel.setText("Cardano");

        javax.swing.GroupLayout ListPanel5Layout = new javax.swing.GroupLayout(ListPanel5);
        ListPanel5.setLayout(ListPanel5Layout);
        ListPanel5Layout.setHorizontalGroup(
            ListPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CardanoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(CardanoPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ListPanel5Layout.setVerticalGroup(
            ListPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ListPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CardanoPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CardanoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ListPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        PolygonPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PolygonPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PolygonPrice.setText("Loading...");

        PolygonLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PolygonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PolygonLabel.setText("Polygon");

        javax.swing.GroupLayout ListPanel6Layout = new javax.swing.GroupLayout(ListPanel6);
        ListPanel6.setLayout(ListPanel6Layout);
        ListPanel6Layout.setHorizontalGroup(
            ListPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PolygonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(PolygonPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ListPanel6Layout.setVerticalGroup(
            ListPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ListPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PolygonPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PolygonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ListPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        PolkadotPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PolkadotPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PolkadotPrice.setText("Loading...");

        PolkadotLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PolkadotLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PolkadotLabel.setText("Polkadot");

        javax.swing.GroupLayout ListPanel7Layout = new javax.swing.GroupLayout(ListPanel7);
        ListPanel7.setLayout(ListPanel7Layout);
        ListPanel7Layout.setHorizontalGroup(
            ListPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PolkadotLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(PolkadotPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ListPanel7Layout.setVerticalGroup(
            ListPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ListPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PolkadotPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PolkadotLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ListPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        LitecoinPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LitecoinPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LitecoinPrice.setText("Loading...");

        LitecoinLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LitecoinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LitecoinLabel.setText("Litecoin");

        javax.swing.GroupLayout ListPanel8Layout = new javax.swing.GroupLayout(ListPanel8);
        ListPanel8.setLayout(ListPanel8Layout);
        ListPanel8Layout.setHorizontalGroup(
            ListPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LitecoinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(LitecoinPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ListPanel8Layout.setVerticalGroup(
            ListPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ListPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LitecoinPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LitecoinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ListPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        ShibaInuPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ShibaInuPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShibaInuPrice.setText("Loading...");

        ShibaInuLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ShibaInuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShibaInuLabel.setText("Shiba Inu");

        javax.swing.GroupLayout ListPanel9Layout = new javax.swing.GroupLayout(ListPanel9);
        ListPanel9.setLayout(ListPanel9Layout);
        ListPanel9Layout.setHorizontalGroup(
            ListPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ShibaInuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(ShibaInuPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ListPanel9Layout.setVerticalGroup(
            ListPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ListPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShibaInuPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShibaInuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout CurrencyContainerLayout = new javax.swing.GroupLayout(CurrencyContainer);
        CurrencyContainer.setLayout(CurrencyContainerLayout);
        CurrencyContainerLayout.setHorizontalGroup(
            CurrencyContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CurrencyContainerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(CurrencyContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ListPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        CurrencyContainerLayout.setVerticalGroup(
            CurrencyContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CurrencyContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        ValuesScrollPane.setViewportView(CurrencyContainer);

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        CurrencyDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "JPY", "GBP", "AUD", "CAD", "CHF", "CNY", "SEK", "MXN" }));
        CurrencyDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrencyDropdownActionPerformed(evt);
            }
        });

        BackButton.setText("Back");

        BackButton1.setText("Back");
        BackButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CurrencyDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(BackButton1)
                        .addGap(18, 18, 18)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(90, Short.MAX_VALUE)
                        .addComponent(ValuesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BackButton)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CurrencyDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(ValuesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BackButton)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// Button handling for updating the values.
    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        populateCurrencies(CurrencyDropdown.getSelectedItem().toString());
    }//GEN-LAST:event_UpdateButtonActionPerformed
// Update the values if the user changes the base rate
    private void CurrencyDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrencyDropdownActionPerformed
        populateCurrencies(CurrencyDropdown.getSelectedItem().toString());
    }//GEN-LAST:event_CurrencyDropdownActionPerformed
// Add back button handling to return to the main page
    private void BackButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton1ActionPerformed
        StartWindow startWin = new StartWindow();
        startWin.show();
        dispose();
    }//GEN-LAST:event_BackButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShowCryptoCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowCryptoCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowCryptoCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowCryptoCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowCryptoCurrency().setVisible(true);
            }
        });
        
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BNBLabel;
    private javax.swing.JLabel BNBPrice;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BackButton1;
    private javax.swing.JLabel BitcoinLabel;
    private javax.swing.JLabel BitcoinPrice;
    private javax.swing.JLabel CardanoLabel;
    private javax.swing.JLabel CardanoPrice;
    private javax.swing.JPanel CurrencyContainer;
    private javax.swing.JComboBox<String> CurrencyDropdown;
    private javax.swing.JLabel DogecoinLabel;
    private javax.swing.JLabel DogecoinPrice;
    private javax.swing.JLabel EthereumLabel;
    private javax.swing.JLabel EthereumPrice;
    private javax.swing.JPanel ListPanel;
    private javax.swing.JPanel ListPanel1;
    private javax.swing.JPanel ListPanel2;
    private javax.swing.JPanel ListPanel3;
    private javax.swing.JPanel ListPanel4;
    private javax.swing.JPanel ListPanel5;
    private javax.swing.JPanel ListPanel6;
    private javax.swing.JPanel ListPanel7;
    private javax.swing.JPanel ListPanel8;
    private javax.swing.JPanel ListPanel9;
    private javax.swing.JLabel LitecoinLabel;
    private javax.swing.JLabel LitecoinPrice;
    private javax.swing.JLabel PolkadotLabel;
    private javax.swing.JLabel PolkadotPrice;
    private javax.swing.JLabel PolygonLabel;
    private javax.swing.JLabel PolygonPrice;
    private javax.swing.JLabel ShibaInuLabel;
    private javax.swing.JLabel ShibaInuPrice;
    private javax.swing.JLabel Title;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JScrollPane ValuesScrollPane;
    private javax.swing.JLabel XRPLabel;
    private javax.swing.JLabel XRPPrice;
    // End of variables declaration//GEN-END:variables
}

