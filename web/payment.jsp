<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Payment Page</title>
    <style>

        .container {
            max-width: 600px;
            margin: 50px auto;
            padding: 20px;
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        table {
            width: 100%;
            border: 2px solid #f2f2f2;
        }

        th, td {
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

        input[type="text"], input[type="email"], input[type="number"], input[type="date"], select, textarea {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            border-radius: 5px;
            box-sizing: border-box;
        }

        textarea {
            height: 100px;
        }

        .submit-btn {
            width: 100%;
            padding: 10px;
            background-color: #28a745;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            margin-top: 10px;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>Pay Via Card</h2>
        
        <form action="homepage.jsp" method="POST">
            <table>

                <tr>
                    <th colspan="2">BILL</th>
                </tr>
                <tr>
                    <td colspan="2"><label for="name">Amount: ___sessionVarForBillAmt</label></td>
                </tr>
                <tr>
                    <th colspan="2">Credit Card Details</th>
                </tr>
                <tr>
                    <td><label for="card-number">Credit Card Number:</label></td>
                    <td><input type="text" id="card-number" name="card_number" placeholder="1234 5678 9012 3456" 
                               maxlength="16" pattern="^\d{16}$" title="Credit card number must be exactly 16 digits (no spaces)" required 
                               oninput="this.value=this.value.replace(/\D/g,'').substring(0,16)"></td>
                </tr>
                <tr>
                    <td><label for="expiry-date">Expiry Date:</label></td>
                    <td><input type="date" id="expiry-date" name="expiry_date" required min="" ></td>
                </tr>
                <tr>
                    <td><label for="cvv">CVV:</label></td>
                    <td><input type="text" id="cvv" name="cvv" placeholder="123" maxlength="3" pattern="\d{3}" 
                               title="CVV must be exactly 3 digits" required 
                               oninput="this.value=this.value.replace(/\D/g,'').substring(0,3)"></td>
                </tr>
            </table>

            <button type="submit" class="submit-btn">PAY NOW</button>
        </form>
    </div>

    <script>
        // Set the minimum date for the expiry date input to today's date
        const today = new Date().toISOString().split('T')[0];
        document.getElementById("expiry-date").setAttribute("min", today);
    </script>

</body>
</html>
