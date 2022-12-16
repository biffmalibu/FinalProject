/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CurrencyConverterProject;


public class ConversionWindow extends javax.swing.JFrame {
    public String converionSelectedCurrency;
    public String convertedSelectedCurrency;
    /**
     * Creates new form ConversionWindow
     */
    public ConversionWindow() {
        initComponents();
    }
    // This method will convert one cryptocurrency into another using live values.
    public void convert() {
        if(conversionSelectedCurrencyLabel.getText() != "Currency" && convertedSelectedCurrencyLabel.getText() != "Currency") {
            LivePrices convertData = new LivePrices();
            String conversionVal = null; // Initialize variables
            String convertedVal = null;
            String currency = "usd";
            String conversionSelection = conversionSelectedCurrencyLabel.getText();
            String convertedSelection = convertedSelectedCurrencyLabel.getText();
            // Find the correct label, then call the api for the correct cryptocurrency value to convert from
                if (convertedSelection == "BTC - Bitcoin") {
                    convertedVal = convertData.getCryptoPrice("bitcoin", currency);
                }
                else if (convertedSelection == "ETH - Ethereum") {
                    convertedVal = convertData.getCryptoPrice("ethereum", currency);
                }
                else if (convertedSelection == "BNB - Binance Coin") {
                    convertedVal = convertData.getCryptoPrice("binancecoin", currency);
                }
                else if (convertedSelection == "XRP - Ripple") {
                    convertedVal = convertData.getCryptoPrice("ripple", currency);
                }
                else if (convertedSelection == "DOGE - Dogecoin") {
                    convertedVal = convertData.getCryptoPrice("dogecoin", currency);
                }
                else if (convertedSelection == "ADA - Cardano") {
                    convertedVal = convertData.getCryptoPrice("cardano", currency);
                }
                else if (convertedSelection == "MATIC - Polygon") {
                    convertedVal = convertData.getCryptoPrice("matic-network", currency);
                }
                else if (convertedSelection == "DOT - Polkadot") {
                    convertedVal = convertData.getCryptoPrice("polkadot", currency);
                }
                else if (convertedSelection == "LTC - Litecoin") {
                    convertedVal = convertData.getCryptoPrice("litecoin", currency);
                }
                else if (convertedSelection == "SHIB - Shiba-Inu") {
                    convertedVal = convertData.getCryptoPrice("shiba-inu", currency);
                }
                else {
                    currencyUserInput.setText("Error: Conversion Fail");
                }
                
                // Find the correct label, then call the api for the correct cryptocurrency value to convert to
                if (conversionSelection == "BTC - Bitcoin") {
                    conversionVal = convertData.getCryptoPrice("bitcoin", currency);
                }
                else if (conversionSelection == "ETH - Ethereum") {
                    conversionVal = convertData.getCryptoPrice("ethereum", currency);
                }
                else if (conversionSelection == "BNB - Binance Coin") {
                    conversionVal = convertData.getCryptoPrice("binancecoin", currency);
                }
                else if (conversionSelection == "XRP - Ripple") {
                    conversionVal = convertData.getCryptoPrice("ripple", currency);
                }
                else if (conversionSelection == "DOGE - Dogecoin") {
                    conversionVal = convertData.getCryptoPrice("dogecoin", currency);
                }
                else if (conversionSelection == "ADA - Cardano") {
                    conversionVal = convertData.getCryptoPrice("cardano", currency);
                }
                else if (conversionSelection == "MATIC - Polygon") {
                    conversionVal = convertData.getCryptoPrice("matic-network", currency);
                }
                else if (conversionSelection == "DOT - Polkadot") {
                    conversionVal = convertData.getCryptoPrice("polkadot", currency);
                }
                else if (conversionSelection == "LTC - Litecoin") {
                    conversionVal = convertData.getCryptoPrice("litecoin", currency);
                }
                else if (conversionSelection == "SHIB - Shiba-Inu") {
                    conversionVal = convertData.getCryptoPrice("shiba-inu", currency);
                }
                else {
                    currencyUserInput.setText("Error: Conversion Fail");
                }
                
                if (conversionVal != null && convertedVal != null) { // Do the conversion here
                        double convertFrom = Double.valueOf(conversionVal);
                        double convertTo = Double.valueOf(convertedVal);
                        double amount = Double.valueOf(currencyUserInput.getText());
                        double ans = (convertFrom / convertTo) * amount;
                        convertedResult.setText(String.valueOf(ans)); // Set the label after converting
                    }

                }
     
    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conversionPanel = new javax.swing.JPanel();
        conversionTitle = new javax.swing.JLabel();
        conversionCryptocurrenciesPanel = new javax.swing.JPanel();
        conversionCryptoCurrenciesLabel = new javax.swing.JLabel();
        conversionCryptocurrenciesDropdown = new javax.swing.JComboBox<>();
        conversionSelectedCurrencyLabel = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        conversionPanel1 = new javax.swing.JPanel();
        convertedTitle = new javax.swing.JLabel();
        conversionCryptocurrenciesPanel1 = new javax.swing.JPanel();
        convertedCryptoCurrenciesLabel = new javax.swing.JLabel();
        convertedCryptocurrenciesDropdown = new javax.swing.JComboBox<>();
        convertedSelectedCurrencyLabel = new javax.swing.JLabel();
        convertedResult = new javax.swing.JTextField();
        buttonsPanel = new javax.swing.JPanel();
        resetButton = new javax.swing.JButton();
        swapButton = new javax.swing.JButton();
        convertButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        currencyUserInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        conversionTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        conversionTitle.setText("Convert From:");

        conversionCryptoCurrenciesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        conversionCryptoCurrenciesLabel.setText("Cryptocurrencies");

        conversionCryptocurrenciesDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BTC - Bitcoin", "ETH - Ethereum", "BNB - Binance Coin", "XRP - Ripple", "DOGE - Dogecoin", "ADA - Cardano", "MATIC - Polygon", "DOT - Polkadot", "LTC - Litecoin", "SHIB - Shiba-Inu" }));
        conversionCryptocurrenciesDropdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conversionCryptocurrenciesDropdownMouseClicked(evt);
            }
        });
        conversionCryptocurrenciesDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conversionCryptocurrenciesDropdownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout conversionCryptocurrenciesPanelLayout = new javax.swing.GroupLayout(conversionCryptocurrenciesPanel);
        conversionCryptocurrenciesPanel.setLayout(conversionCryptocurrenciesPanelLayout);
        conversionCryptocurrenciesPanelLayout.setHorizontalGroup(
            conversionCryptocurrenciesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conversionCryptoCurrenciesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(conversionCryptocurrenciesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conversionCryptocurrenciesDropdown, 0, 238, Short.MAX_VALUE)
                .addContainerGap())
        );
        conversionCryptocurrenciesPanelLayout.setVerticalGroup(
            conversionCryptocurrenciesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conversionCryptocurrenciesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conversionCryptoCurrenciesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(conversionCryptocurrenciesDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        conversionSelectedCurrencyLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        conversionSelectedCurrencyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        conversionSelectedCurrencyLabel.setText("Currency");

        javax.swing.GroupLayout conversionPanelLayout = new javax.swing.GroupLayout(conversionPanel);
        conversionPanel.setLayout(conversionPanelLayout);
        conversionPanelLayout.setHorizontalGroup(
            conversionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conversionSelectedCurrencyLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(conversionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conversionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conversionPanelLayout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addComponent(conversionCryptocurrenciesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
        );
        conversionPanelLayout.setVerticalGroup(
            conversionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conversionPanelLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(conversionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conversionCryptocurrenciesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conversionSelectedCurrencyLabel)
                .addContainerGap())
        );

        Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Cryptocurrency Converter");

        convertedTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        convertedTitle.setText("Convert To:");

        convertedCryptoCurrenciesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        convertedCryptoCurrenciesLabel.setText("Cryptocurrencies");

        convertedCryptocurrenciesDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BTC - Bitcoin", "ETH - Ethereum", "BNB - Binance Coin", "XRP - Ripple", "DOGE - Dogecoin", "ADA - Cardano", "MATIC - Polygon", "DOT - Polkadot", "LTC - Litecoin", "SHIB - Shiba-Inu" }));
        convertedCryptocurrenciesDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertedCryptocurrenciesDropdownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout conversionCryptocurrenciesPanel1Layout = new javax.swing.GroupLayout(conversionCryptocurrenciesPanel1);
        conversionCryptocurrenciesPanel1.setLayout(conversionCryptocurrenciesPanel1Layout);
        conversionCryptocurrenciesPanel1Layout.setHorizontalGroup(
            conversionCryptocurrenciesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(convertedCryptoCurrenciesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
            .addGroup(conversionCryptocurrenciesPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(convertedCryptocurrenciesDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        conversionCryptocurrenciesPanel1Layout.setVerticalGroup(
            conversionCryptocurrenciesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conversionCryptocurrenciesPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(convertedCryptoCurrenciesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(convertedCryptocurrenciesDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        convertedSelectedCurrencyLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        convertedSelectedCurrencyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        convertedSelectedCurrencyLabel.setText("Currency");

        convertedResult.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        convertedResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout conversionPanel1Layout = new javax.swing.GroupLayout(conversionPanel1);
        conversionPanel1.setLayout(conversionPanel1Layout);
        conversionPanel1Layout.setHorizontalGroup(
            conversionPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(convertedSelectedCurrencyLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(conversionPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(convertedTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(conversionCryptocurrenciesPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conversionPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(convertedResult, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
        conversionPanel1Layout.setVerticalGroup(
            conversionPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conversionPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(conversionPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(convertedTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conversionCryptocurrenciesPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(convertedSelectedCurrencyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convertedResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        swapButton.setText("Swap");
        swapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swapButtonActionPerformed(evt);
            }
        });

        convertButton.setText("Convert!");
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resetButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convertButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(swapButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(swapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        currencyUserInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        currencyUserInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        currencyUserInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currencyUserInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton)
                .addGap(18, 18, 18)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conversionPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conversionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currencyUserInput, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(242, 242, 242))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conversionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currencyUserInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(conversionPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void currencyUserInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currencyUserInputActionPerformed
    
    }//GEN-LAST:event_currencyUserInputActionPerformed

    private void conversionCryptocurrenciesDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conversionCryptocurrenciesDropdownActionPerformed
        converionSelectedCurrency = conversionCryptocurrenciesDropdown.getSelectedItem().toString();
        conversionSelectedCurrencyLabel.setText(converionSelectedCurrency);
    }//GEN-LAST:event_conversionCryptocurrenciesDropdownActionPerformed

    
    
    private void convertedCryptocurrenciesDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertedCryptocurrenciesDropdownActionPerformed
        convertedSelectedCurrency = convertedCryptocurrenciesDropdown.getSelectedItem().toString();
        convertedSelectedCurrencyLabel.setText(convertedSelectedCurrency);
    }//GEN-LAST:event_convertedCryptocurrenciesDropdownActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        conversionSelectedCurrencyLabel.setText("Currency");
        convertedSelectedCurrencyLabel.setText("Currency");
        currencyUserInput.setText("");
        convertedResult.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void swapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swapButtonActionPerformed
        String temp = conversionSelectedCurrencyLabel.getText();
        conversionSelectedCurrencyLabel.setText(convertedSelectedCurrencyLabel.getText());
        convertedSelectedCurrencyLabel.setText(temp);
        convert();
        
        
    }//GEN-LAST:event_swapButtonActionPerformed

    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        convert();
    }//GEN-LAST:event_convertButtonActionPerformed

    private void conversionCryptocurrenciesDropdownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conversionCryptocurrenciesDropdownMouseClicked
        
    }//GEN-LAST:event_conversionCryptocurrenciesDropdownMouseClicked

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        StartWindow startWin = new StartWindow();
        startWin.show();
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ConversionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversionWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JLabel conversionCryptoCurrenciesLabel;
    private javax.swing.JComboBox<String> conversionCryptocurrenciesDropdown;
    private javax.swing.JPanel conversionCryptocurrenciesPanel;
    private javax.swing.JPanel conversionCryptocurrenciesPanel1;
    private javax.swing.JPanel conversionPanel;
    private javax.swing.JPanel conversionPanel1;
    private javax.swing.JLabel conversionSelectedCurrencyLabel;
    private javax.swing.JLabel conversionTitle;
    private javax.swing.JButton convertButton;
    private javax.swing.JLabel convertedCryptoCurrenciesLabel;
    private javax.swing.JComboBox<String> convertedCryptocurrenciesDropdown;
    private javax.swing.JTextField convertedResult;
    private javax.swing.JLabel convertedSelectedCurrencyLabel;
    private javax.swing.JLabel convertedTitle;
    private javax.swing.JTextField currencyUserInput;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton swapButton;
    // End of variables declaration//GEN-END:variables
}
