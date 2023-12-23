import SwiftUI
import shared

@main
struct iOSApp: App {

    init() {
        IosAppInitKt.iosAppInit()
    }

	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}
