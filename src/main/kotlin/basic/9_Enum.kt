package basic

enum class PaymentStatus(val label: String) : Payable {
  UNPAID("미지급") {
    override fun isPayable(): Boolean = true
  },
  PAID("지급완료"),
  FAILED("지급실패"),
  REFUNDED("환불");

}

interface Payable {
  fun isPayable(): Boolean = false
}

fun main() {
  println(PaymentStatus.UNPAID.label)

  if (PaymentStatus.UNPAID.isPayable()) {
    println("결제 가능 상태")
  }

  val paymentStatus = PaymentStatus.valueOf("PAID")
  println(paymentStatus.label)
  println(paymentStatus.isPayable())

  if (paymentStatus == PaymentStatus.PAID) {
    println("결제 완료 상태")
  }

  for (status in PaymentStatus.entries) {
    println("[${status.name}](${status.label}): ${status.ordinal}")
  }

}