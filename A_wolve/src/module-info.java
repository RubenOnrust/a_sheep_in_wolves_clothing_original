module A_wolve {
	<?xml version="1.0" encoding="UTF-8"?>

	<?import javafx.scene.chart.NumberAxis?>
	<?import javafx.scene.chart.StackedAreaChart?>
	<?import javafx.scene.control.Button?>
	<?import javafx.scene.control.Label?>
	<?import javafx.scene.control.Menu?>
	<?import javafx.scene.control.MenuBar?>
	<?import javafx.scene.control.MenuButton?>
	<?import javafx.scene.control.MenuItem?>
	<?import javafx.scene.control.ScrollBar?>
	<?import javafx.scene.control.SplitPane?>
	<?import javafx.scene.control.TextField?>
	<?import javafx.scene.layout.AnchorPane?>
	<?import javafx.scene.layout.VBox?>


	<VBox maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="592.0" prefWidth="769.0" xmlns="http://javafx.com/javafx/11.0.1" xmlns:fx="http://javafx.com/fxml/1">
	   <children>
	      <MenuBar>
	        <menus>
	          <Menu mnemonicParsing="false" text="File">
	            <items>
	              <MenuItem mnemonicParsing="false" text="Close" />
	            </items>
	          </Menu>
	          <Menu mnemonicParsing="false" text="Edit">
	            <items>
	              <MenuItem mnemonicParsing="false" text="Delete" />
	            </items>
	          </Menu>
	          <Menu mnemonicParsing="false" text="Help">
	            <items>
	              <MenuItem mnemonicParsing="false" text="About" />
	            </items>
	          </Menu>
	        </menus>
	      </MenuBar>
	      <SplitPane dividerPositions="0.29797979797979796" prefHeight="573.0" prefWidth="769.0">
	        <items>
	          <AnchorPane minHeight="0.0" minWidth="0.0">
	               <children>
	                  <Label layoutX="68.0" layoutY="14.0" text="Number of cattle" textAlignment="CENTER" />
	                  <TextField layoutX="39.0" layoutY="44.0" />
	                  <ScrollBar layoutX="205.0" layoutY="1.0" orientation="VERTICAL" prefHeight="565.0" prefWidth="14.0" AnchorPane.rightAnchor="7.0" />
	                  <Label layoutX="65.0" layoutY="75.0" text="Number of horses" />
	                  <TextField layoutX="39.0" layoutY="104.0" />
	                  <Label layoutX="71.0" layoutY="140.0" text="Number of deer" textAlignment="CENTER" />
	                  <TextField layoutX="39.0" layoutY="165.0" />
	                  <Label layoutX="65.0" layoutY="205.0" text="Number of wolves" />
	                  <TextField layoutX="39.0" layoutY="230.0" />
	                  <Label layoutX="92.0" layoutY="266.0" text="Years" textAlignment="CENTER" />
	                  <TextField layoutX="39.0" layoutY="283.0" />
	                  <Label contentDisplay="CENTER" layoutX="59.0" layoutY="327.0" text="Mathematical model" textAlignment="CENTER" />
	                  <MenuButton layoutX="50.0" layoutY="353.0" mnemonicParsing="false" text="choose you model">
	                    <items>
	                      <MenuItem mnemonicParsing="false" text="Exponential" />
	                      <MenuItem mnemonicParsing="false" text="the other one" />
	                        <MenuItem mnemonicParsing="false" text="Unspecified Action" />
	                    </items>
	                  </MenuButton>
	                  <Button layoutX="74.0" layoutY="526.0" mnemonicParsing="false" text="Calculate" />
	               </children>
	            </AnchorPane>
	          <AnchorPane minHeight="0.0" minWidth="0.0" prefHeight="160.0" prefWidth="100.0">
	               <children>
	                  <StackedAreaChart layoutX="8.0" layoutY="24.0">
	                    <xAxis>
	                      <NumberAxis side="BOTTOM" />
	                    </xAxis>
	                    <yAxis>
	                      <NumberAxis side="LEFT" />
	                    </yAxis>
	                  </StackedAreaChart>
	               </children>
	            </AnchorPane>
	        </items>
	      </SplitPane>
	   </children>
	</VBox>
}