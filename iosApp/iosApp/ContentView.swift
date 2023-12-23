import UIKit
import SwiftUI
import shared

struct ComposeView: UIViewControllerRepresentable {
    private let onClose: () -> ()
    
    init(onClose: @escaping () -> ()) {
        self.onClose = onClose
    }
    
    func makeUIViewController(context: Context) -> UIViewController {
        Main_iosKt.MainViewController()
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}

struct ContentView: View {
    var body: some View {
        ComposeView() {
            print("do nothing")
        }.ignoresSafeArea(.all, edges: .bottom) // Compose has own keyboard handler
    }
}
