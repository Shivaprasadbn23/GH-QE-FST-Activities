<?xml version="1.0" encoding="utf-8"?><testsuites name="pytest tests"><testsuite name="pytest" errors="0" failures="1" skipped="0" tests="2" time="0.114" timestamp="2026-03-10T16:31:00.356146+05:30" hostname="IBM-1R0NR24"><testcase classname="test_multiplication" name="test_transactions[30-10-20]" time="0.001" /><testcase classname="test_multiplication" name="test_transactions[20-2-8]" time="0.001"><failure message="assert 18 == 8">wallet_amount = 18, earned = 20, spent = 2, expected = 8

    @pytest.mark.parametrize("earned, spent, expected", [ (30, 10, 20), (20, 2, 8), ])
    def test_transactions(wallet_amount, earned, spent, expected):
    
        # Add money to your wallet
        wallet_amount += earned
    
        # Subtract amount from wallet
        wallet_amount -= spent
    
        # Assertion
&gt;       assert wallet_amount == expected
E       assert 18 == 8

test_multiplication.py:20: AssertionError</failure></testcase></testsuite></testsuites>