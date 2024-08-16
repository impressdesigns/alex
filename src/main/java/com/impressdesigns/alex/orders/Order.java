package com.impressdesigns.alex.orders;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import org.hibernate.annotations.Immutable;

@Getter
@Entity
@Table(name = "Orders")
@Immutable
public class Order {

    // Summary
    @Id
    @Column(name = "ID_Order", nullable = false, unique = true)
    private int order_id;
    @Column(name = "CustomerPurchaseOrder")
    private String customer_purchase_order;
    @Column(name = "id_Customer")
    private String customer_id;
    @Column(name = "id_EmpCreatedBy")
    private String created_by_id;
    @Column(name = "id_OrderType")
    private String order_type_id;
    // Quantities
    @Column(name = "cn_TotalProductQty_ToProduce")
    private String product_quantity;
    @Column(name = "cn_TotalProductQty_Imprints")
    private String decoration_quantity;
    // Dates
    @Column(name = "date_Creation")
    private String date_created;
    @Column(name = "date_OrderPlaced")
    private String date_placed;
    @Column(name = "date_OrderRequestedToShip")
    private String date_approximate_ship;
    @Column(name = "date_OrderDropDead")
    private String date_in_hands;
    // Statuses
    @Column(name = "sts_01")
    private String status_hold;
    @Column(name = "sts_ArtDone")
    private String status_art;
    @Column(name = "sts_02b")
    private String status_art_secondary;
    @Column(name = "sts_Purchased")
    private String status_purchased;
    @Column(name = "sts_PurchasedSub")
    private String status_purchased_sub;
    @Column(name = "sts_Received")
    private String status_received;
    @Column(name = "sts_ReceivedSub")
    private String status_received_sub;
    @Column(name = "sts_Produced")
    private String status_produced;
    @Column(name = "sts_Shipped")
    private String status_shipped;
    @Column(name = "sts_Invoiced")
    private String status_invoiced;
    @Column(name = "sts_Paid")
    private String status_paid;
    // Custom statuses
    @Column(name = "sts_10")
    private String status_notification;
    @Column(name = "sts_10b")
    private String status_notification_secondary;
    @Column(name = "sts_11")
    private String status_pulled;
    @Column(name = "sts_11b")
    private String status_pulled_secondary;
    @Column(name = "sts_12")
    private String status_vas;
    @Column(name = "sts_12b")
    private String status_vas_secondary;
    @Column(name = "sts_13")
    private String status_ship2;
    @Column(name = "sts_13b")
    private String status_ship2_secondary;
    // Notes "on"
    @Column(name = "NotesOnOrder")
    private String notes_on_order;
    @Column(name = "NotesOnHold")
    private String notes_on_hold;
    @Column(name = "NotesOnArt")
    private String notes_on_art;
    @Column(name = "NotesOnPurchasing")
    private String notes_on_purchasing;
    @Column(name = "NotesOnPurchasingSub")
    private String notes_on_purchasing_sub;
    @Column(name = "NotesOnReceiving")
    private String notes_on_receiving;
    @Column(name = "NotesOnProduction")
    private String notes_on_production;
    @Column(name = "NotesOnShipping")
    private String notes_on_shipping;
    @Column(name = "NotesOnAccounting")
    private String notes_on_accounting;
    // Notes "to"
    @Column(name = "NotesToArt")
    private String notes_to_art;
    @Column(name = "NotesToPurchasing")
    private String notes_to_purchasing;
    @Column(name = "NotesToPurchasingSub")
    private String notes_to_purchasing_sub;
    @Column(name = "NotesToReceiving")
    private String notes_to_receiving;
    @Column(name = "NotesToProduction")
    private String notes_to_production;
    @Column(name = "NotesToFinishing")
    private String notes_to_finishing;
    @Column(name = "NotesToShipping")
    private String notes_to_shipping;
    @Column(name = "NotesToAccounting")
    private String notes_to_accounting;
    // Notes "web"
    @Column(name = "NotesToWebCustomer")
    private String notes_to_web_customer;
    @Column(name = "NotesToWebSalesperson")
    private String notes_to_web_salesperson;
}
