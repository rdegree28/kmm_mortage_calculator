//
//  ViewController.swift
//  iosApp
//
//  Created by DeGree, Robert on 2/7/21.
//  Copyright © 2021 orgName. All rights reserved.
//

import UIKit
import shared

class ViewController: UIViewController {
    
    @IBOutlet weak var resultLabel: UILabel!
    
    @IBOutlet weak var calculateButton: UIButton!
    @IBOutlet weak var principalEditText: UITextField!
    @IBOutlet weak var interestEditText: UITextField!
    
    override func viewDidLoad() {
        super.viewDidLoad()
    }
    
    
    @IBAction func calculateTapped(_ sender: Any) {
        
        let mortgageRepo = MortgageRepo(logger: MortgageLogger(tag: "Result iOS"))
        
        let principal = Int32(principalEditText.text!)!
        let interestRate = Float(interestEditText.text!)!
        
        let result = mortgageRepo.calcPayment(principal: principal, interestRate: interestRate)
        resultLabel.text = result
        
    }
}
